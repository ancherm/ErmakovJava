package ru.chermashentsev.database;

class Connection {
    private final Database database;

    public Connection(Database database) {
        if (database == null) {
            throw new IllegalArgumentException("Передайте базу данных");
        }
        this.database = database;
    }

    public String getValue(int index) {
        return database.getValue(index);
    }

    public void setValue(String value) {
        database.setValue(value);
    }

}
