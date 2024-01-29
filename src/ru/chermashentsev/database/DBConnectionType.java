package ru.chermashentsev.database;

import java.util.List;

public enum DBConnectionType {
    RECORDS(Database.getMaxConnectionCount());


    private List<String> records;
    private final int maxConnectionCount;

    DBConnectionType(int maxConnectionCount) {
        this.maxConnectionCount = maxConnectionCount;
    }

    class Records {
        String getValue(int index) {
            return records.get(index) != null ? records.get(index) : null;
        }

        void setValue(String value) {
            records.add(value);
        }

        public int getMaxConnectionCount() {
            return maxConnectionCount;
        }
    }


    /*String getValue(int index) {
        return records.get(index) != null ? records.get(index) : null;
    }

    void setValue(String value) {
        records.add(value);
    }

    public int getMaxConnectionCount() {
        return maxConnectionCount;
    }*/
}
