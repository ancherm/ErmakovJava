package ru.chermashentsev.reflect;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectReader<T> {
    private final String fileName;

    public ObjectReader(String fileName) {
        this.fileName = fileName;
    }
    public List<T> readFile() {
        List<T> resultList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split("\\s+");
                String className = parts[0];

                String[] params = new String[parts.length - 1];

                System.arraycopy(parts, 1, params, 0, params.length);
                try {
                    Class<?> clazz = Class.forName(className);
                    Object obj = clazz.getConstructor(String[].class).newInstance((Object) params);

                    resultList.add((T) obj);

                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return resultList;
    }
}
