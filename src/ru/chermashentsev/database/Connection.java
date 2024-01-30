package ru.chermashentsev.database;

public class Connection {
    private Database database;

    public Connection(Database database) {
        setConnection(database);
    }

    public void setConnection(Database database) {
        if (database == null) {
            throw new IllegalArgumentException("Передайте базу данных");
        }
        this.database = database;
    }

    public String getValue(int index) {
//        if (this == null) throw new IllegalArgumentException("NULLLL");
        return database.getValue(index);
    }

    public void setValue(String value) {
        database.setValue(value);
    }

}
