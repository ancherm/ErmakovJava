package ru.chermashentsev.database;

import java.util.*;

public class ConnectionPool {
    private final Stack<Connection> connectionStack;


    public ConnectionPool(Database database, int maxConnectionCount) {
        connectionStack = new Stack<>();

        for (int i = 0; i < maxConnectionCount; i++) {
            connectionStack.add(new Connection(database));
        }
    }
    public Connection connect() {
        return !connectionStack.empty() ? connectionStack.pop() : null;
    }

    public void disconnect(Connection connection) {
        if (connectionStack.contains(null) && connection != null) {
            connectionStack.push(connection);
        }
    }

}
