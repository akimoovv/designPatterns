package com.company.comand;

public class UpdateComand implements Comand{
    Database database;

    public UpdateComand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
