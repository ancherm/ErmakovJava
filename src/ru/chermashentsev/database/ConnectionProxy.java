package ru.chermashentsev.database;

public class ConnectionProxy {
    private Connection connection;


    public ConnectionProxy(Connection connection) {
        this.connection = connection;
    }

    public String getValue(int index) {
        isNullConnection(connection);
        return connection.getValue(index);
    }

    public void setValue(String value) {
        isNullConnection(connection);
        connection.setValue(value);
    }

    private void isNullConnection(Connection connection) {
        if (connection == null) {
            throw new IllegalArgumentException("Соединение не подключено к базе данных");
        }
    }

}
