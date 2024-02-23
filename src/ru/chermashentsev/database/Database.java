package ru.chermashentsev.database;

import java.util.List;

class Database {
    private final List<String> records;

    public Database(List<String> records) {
        if (records == null) {
            throw new IllegalArgumentException("Передайте список строк");
        }
        this.records = records;
    }

    String getValue(int index) {
        return index < records.size() ? records.get(index) : null;
    }

    void setValue(String value) {
        if (value != null)  records.add(value);
    }

}
