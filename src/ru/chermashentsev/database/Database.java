package ru.chermashentsev.database;

import java.util.List;

public class Database {
    List<String> records;
    private int maxConnectionCount;
    private int currentConnectionCount = 0;

    public Database(List<String > records, int maxConnectionCount) {
        if (records == null) throw new IllegalArgumentException("Передайте список строк");
        if (maxConnectionCount <= 0) throw new IllegalArgumentException("Укажите больше 0 разрешенных подключений");

        this.records = records;
        this.maxConnectionCount = maxConnectionCount;
    }

    String getValue(int index) {
        return index < records.size() ? records.get(index) : null;
    }

    void setValue(String value) {
        if (value != null)  records.add(value);
    }

    boolean connect() {
        if (currentConnectionCount >= maxConnectionCount) return false;
        currentConnectionCount++;
        return true;
    }

    boolean disconnect() {
        if (currentConnectionCount < 0) return false;
        currentConnectionCount--;
        return true;
    }
}
