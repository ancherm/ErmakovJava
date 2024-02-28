package ru.chermashentsev.reflect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ObjectWriter {

    private final String fileName;
    private File file;

    public ObjectWriter(String fileName) {
        this.fileName = fileName;
    }


    public void writeFile(List<Object> objects) {
        file = new File(fileName);

        try (FileWriter fileWriter = new FileWriter(file)) {

            for (Object obj : objects) {
                fileWriter.write(obj.toString() + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
