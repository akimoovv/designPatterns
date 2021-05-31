package com.company.delegate;

public class SeniorDeveloper implements Developer {

    JuniorDeveloper juniorDeveloper = new JuniorDeveloper();

    @Override
    public void solveProblem() {
        System.out.println("Senior developer defines problem");
        System.out.println("Delegate to junior developer");
        juniorDeveloper.solveProblem();
    }
}
