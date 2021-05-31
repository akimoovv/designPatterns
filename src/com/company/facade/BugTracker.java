package com.company.facade;

public class BugTracker {
    private boolean isActiveSprint;

    public boolean isActiveSprint() {
        return isActiveSprint;
    }

    public void startSpring() {
        System.out.println("Spring is active");
        this.isActiveSprint = true;
    }

    public void finishSpring() {
        System.out.println("Spring is not active");
        this.isActiveSprint = false;
    }
}
