package ru.chermashentsev.database;

import java.util.*;

public class ConnectionPool {
    private final Database database;
    private final Stack<Connection> connectionStack;
    private final int maxConnectionCount;


    public ConnectionPool(List<String> records, int maxConnectionCount) {
        database = new Database(records);

        this.maxConnectionCount = maxConnectionCount;
        connectionStack = new Stack<>();

        for (int i = 0; i < maxConnectionCount; i++) {
            connectionStack.push(new Connection(database));
        }
    }

    public ConnectionProxy connect() {
        return !connectionStack.empty() ? new ConnectionProxy(connectionStack.pop(), this) : null;
    }

    void disconnect(ConnectionProxy connection) {
        if (connectionStack.size() < maxConnectionCount && connection != null) {
            connectionStack.push(connection.getConnection());
        }
    }

}
