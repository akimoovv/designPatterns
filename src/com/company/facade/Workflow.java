package com.company.facade;

public class Workflow {
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();
    private Job job = new Job();

    public void workingProcess() {
        job.doJob();
        bugTracker.startSpring();
        developer.doJob(bugTracker);
        bugTracker.finishSpring();
        developer.doJob(bugTracker);
    }
}
