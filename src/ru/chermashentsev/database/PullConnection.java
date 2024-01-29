package ru.chermashentsev.database;

import java.util.ArrayList;
import java.util.List;

public class PullConnection {
    private List<Connection> connectionList;

    public PullConnection(Database database, int maxConnectionCount) {

        connectionList = new ArrayList<>();

        for (int i = 0; i < maxConnectionCount; i++) {
            connectionList.add(new Connection(database));
        }
    }
    public Connection connect() {
        for (int index = 0; index < connectionList.size(); index++) {
            if (connectionList.get(index) != null) {
                Connection tmp = connectionList.get(index);
                connectionList.set(index, null);
                return tmp;
            }
        }
        throw new IllegalArgumentException("Нет свободных соединений");
    }

    public Connection disconnect(Connection connection) {
        for (int index = 0; index < connectionList.size(); index++) {
            if (connectionList.get(index) == null) {
                connectionList.set(index, connection);
                break;
            }
        }
        return null;
    }

}
