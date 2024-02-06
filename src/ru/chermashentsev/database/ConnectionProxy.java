package ru.chermashentsev.database;

public class ConnectionProxy {
    private Connection connection;
    private ConnectionPool connectionPool;


    private ConnectionProxy() { }

    public ConnectionProxy(Connection connection, ConnectionPool connectionPool) {
        this.connection = connection;
        this.connectionPool = connectionPool;
    }

    public String getValue(int index) {
        checkIsConnected();
        return connection.getValue(index);
    }

    public void setValue(String value) {
        checkIsConnected();
        connection.setValue(value);
    }


    public void disconnect() {
        connectionPool.disconnect(this);
        connection = null;
    }


    Connection getConnection() {
        return connection;
    }


    private void checkIsConnected() {
        if (connection == null) {
            throw new IllegalArgumentException("Соединение не подключено к базе данных");
        }
    }

}
