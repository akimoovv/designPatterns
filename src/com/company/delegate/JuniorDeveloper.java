package com.company.delegate;

public class JuniorDeveloper implements  Developer {
    @Override
    public void solveProblem() {
        System.out.println("Junior developer's solving a problem");
    }
}
