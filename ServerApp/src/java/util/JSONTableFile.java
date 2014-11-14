/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author adam
 */
public class JSONTableFile<E> extends JSONFile<JSONTableData<E>> {

    public JSONTableFile(File file) {
        super(file);
    }
    @Getter
    public int lastInsertId;

    //same elementy
    public List<E> getItems() {
        ensure();
        JSONTableData<E> data = super.get();
        return data.elements;
    }

    private void ensure() {
        JSONTableData<E> data = super.get();
        if (data == null) {
            data = new JSONTableData<>();
            data.elements = new ArrayList<>();
            data.lastId = 0;
        }
        set(data);
    }

    //same elementy
    public void setItems(List<E> items) {
        ensure();
        JSONTableData<E> data = super.get();
        data.elements = items;
        set(data);
    }

    public void add(E element) {
        ensure();
        JSONTableData<E> data = super.get();
        data.elements.add(element);
        data.lastId++;
        lastInsertId = data.lastId;
        set(data);
    }

    public void remove(E element) {
        ensure();
        JSONTableData<E> data = super.get();
        data.elements.remove(element);
        set(data);
    }

}
