package com.company.singleton;

public class SingleTonRunner {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactory.Share.INSTANCE;
        sessionFactory.getCurrentSession();
    }
}
