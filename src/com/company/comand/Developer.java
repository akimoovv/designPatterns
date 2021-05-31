package com.company.comand;

public class Developer {
    Comand insert;
    Comand update;
    Comand select;
    Comand delete;

    public Developer(Comand insert, Comand update, Comand select, Comand delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {insert.execute();}
    public void updateRecord() {update.execute();}
    public void selectRecord() {select.execute();}
    public void deleteRecord() {delete.execute();}
}
