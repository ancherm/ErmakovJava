package ru.chermashentsev.database;

public class Connection {
    DBConnectionType type;
    public Connection(DBConnectionType type) {
        //if (type == DBConnectionType.RECORDS) {
//            type = DBConnectionType.Records();
        //}

        this.type = type;

    }

//    public String getValue(int index) {
//        return DBConnectionType.Records
////        return type.getValue(index);
//    }

//    public void setValue(String value) {
//        type.setValue(value);
//    }
}
