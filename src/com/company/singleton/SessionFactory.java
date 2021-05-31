package com.company.singleton;

public class SessionFactory {

    static class Share  {
        static final SessionFactory INSTANCE = new SessionFactory();
    }

    public void getCurrentSession() {
        System.out.println("Getting current session");
    }
}
