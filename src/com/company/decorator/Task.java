package com.company.decorator;


public class Task {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JuniorJavaDeveloper());

        System.out.println(developer.makeJob());
    }
}
