package com.company.facade;

public class Developer {
    public void doJob(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer: Doing job");
        } else {
            System.out.println("Developer: Waiting");
        }
    }
}
