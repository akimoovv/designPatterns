package com.company.comand;

public class DataBaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertComand(database),
                new DeleteComand(database),
                new UpdateComand(database),
                new SelectComand(database)
        );

        database.insert();
        database.delete();
        database.update();
        database.select();

    }
}
