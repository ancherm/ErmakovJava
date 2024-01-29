package ru.chermashentsev.database;

import java.util.List;

public class Database<T> {
    List<T> records;
    private static int maxConnectionCount;

    public Database(List<T> records, int maxConnectionCount) {
        this.records = records;
        Database.maxConnectionCount = maxConnectionCount;
    }

    T getValue(int index) {
        return records.get(index) != null ? records.get(index) : null;
    }

    void setValue(T value) {
        records.add(value);
    }

    public static int getMaxConnectionCount() {
        return maxConnectionCount;
    }
}
