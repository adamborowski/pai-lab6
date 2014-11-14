/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.adamborowski.kot;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import lombok.Getter;
import pl.adamborowski.kot.data.Cat;

@Stateful @LocalBean
public class ValueListService {

    @EJB
    private CatManager catManager;
    @Getter
    protected List<Cat> list;
    protected ListIterator<Cat> listIterator;

    @PostConstruct
    private void startup() {
        list = catManager.find();
    }
    
    public void refresh(){
        list = catManager.find();
        resetIndex();
    }

    public int getSize() {
        return list.size();
    }

    public Cat getCurrentElement() {
        int currIndex = listIterator.nextIndex();
        return list.get(currIndex);
    }

    public List<Cat> getPreviousElements(int count) {
        LinkedList<Cat> newList = new LinkedList();
        for (int i = 0; listIterator.hasPrevious() && i < count; i++) {
            newList.add(listIterator.previous());
        }
        return newList;
    }

    public List getNextElements(int count) {
        LinkedList<Cat> newList = new LinkedList();
        for (int i = 0; listIterator.hasNext() && i < count; i++) {
            newList.add(listIterator.next());
        }
        return newList;
    }

    public void resetIndex() {
        listIterator = list.listIterator();
    }
}
