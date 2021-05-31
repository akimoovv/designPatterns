package com.company.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("Vacancy 1");
        Observer subscriber1 = new Subscriber("subscriber 1");
        Observer subscriber2 = new Subscriber("subscriber 2");

        site.addObserver(subscriber1);
        site.addObserver(subscriber2);

        site.addVacancy("Vacancy 3");
        site.removeVacancy("Vacancy 3");
    }
}
