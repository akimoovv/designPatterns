package com.company.comand;

public class DeleteComand implements Comand {

    Database database;

    public DeleteComand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
