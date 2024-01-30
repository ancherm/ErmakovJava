package ru.chermashentsev.database;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private final List<ConnectionProxy> connectionList;
    private final ConnectionProxy nullConnection = new ConnectionProxy();


    public ConnectionPool(Database database, int maxConnectionCount) {

        connectionList = new ArrayList<>();

        for (int i = 0; i < maxConnectionCount; i++) {
            connectionList.add(new ConnectionProxy(new Connection(database)));
        }
    }
    public ConnectionProxy connect() {
        for (int index = 0; index < connectionList.size(); index++) {
            if (connectionList.get(index) != null) {
                ConnectionProxy tmp = connectionList.get(index);
                connectionList.set(index, null);
                return tmp;
            }
        }
        throw new IllegalArgumentException("Нет свободных соединений");
    }

    public ConnectionProxy disconnect(ConnectionProxy connection) {
        for (int index = 0; index < connectionList.size(); index++) {
            if (connectionList.get(index) == null) {
                connectionList.set(index, connection);
                break;
            }
        }
        return nullConnection;
    }

}
