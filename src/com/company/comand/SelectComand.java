package com.company.comand;

public class SelectComand implements Comand{

    Database database;

    public SelectComand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
