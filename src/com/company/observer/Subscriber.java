package com.company.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + ", there are some changes in vacancies");
        System.out.println(vacancies);
        System.out.println("********************************************");
    }
}
