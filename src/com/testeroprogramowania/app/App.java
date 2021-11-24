package com.testeroprogramowania.app;

import com.testeroprogramowania.app.database.DatabaseConexion;
import com.testeroprogramowania.app.database.DatabaseUtils;

public class App {
    public static void main(String[] args) {
        DatabaseConexion databaseConexion=new DatabaseConexion();
        DatabaseUtils databaseUtils=new DatabaseUtils();
    }
}
