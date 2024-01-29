package ru.chermashentsev.database;

public class Connection {
    Database database;

    public Connection(Database database) {
        setConnection(database);
    }

    public void setConnection(Database database) {
        if (database == null) throw new IllegalArgumentException("Передайте базу данных");

        boolean isCheck = database.connect();

        if (isCheck)
            this.database = database;
        else
            this.database = null;
    }

    public void disconnect() {
        database.disconnect();
    }

    public String getValue(int index) {
        if (database == null) return null;
        return database.getValue(index);
    }

    public void setValue(String value) {
        if (database == null) return;
        database.setValue(value);
    }
}
