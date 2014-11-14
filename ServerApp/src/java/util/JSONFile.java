/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import lombok.AllArgsConstructor;

/**
 *
 * @author adam
 */
@AllArgsConstructor
public class JSONFile<T> {

    private final File file;

    public T get() {
        try {
            JsonReader reader = new JsonReader(new FileInputStream(file));
            return (T) reader.readObject();
        } catch (IOException ex) {
            return null;
        }
    }

    public boolean set(T o) {
        try {
            JsonWriter writer = new JsonWriter(new FileOutputStream(file));
            writer.write(o);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
}
