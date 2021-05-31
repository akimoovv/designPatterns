package com.company.builder;

public class UserBuilder {
    private User user = new User();

    public UserBuilder() {
    }

    public UserBuilder(User user) {
        this.user = user;
    }

    UserBuilder buildName(String name) {
        user.addSurname(name);
        return new UserBuilder(new User(name, user.getSurname(), user.getAge()));
    }

    UserBuilder buildSureName(String surname) {
        user.addSurname(surname);
        return new UserBuilder(new User(user.getName(), surname, user.getAge()));
    }

    UserBuilder buildAge(Integer age) {
        user.addAge(age);
        return new UserBuilder(new User(user.getName(), user.getSurname(), age));

    }

    User build() {
        return user;
    }
}
