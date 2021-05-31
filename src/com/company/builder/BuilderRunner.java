package com.company.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        User user = new UserBuilder().buildSureName("Akimov").buildName("Ivan").buildAge(19).build();
        System.out.println(user);
    }
}
