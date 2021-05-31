package com.company.comand;

public class InsertComand implements Comand{
    Database database;

    public InsertComand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
