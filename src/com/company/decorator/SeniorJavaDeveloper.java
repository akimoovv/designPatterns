package com.company.decorator;

public class SeniorJavaDeveloper extends  DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return seniorJob() + developer.makeJob();
    }

    private String seniorJob() {
        return "Drinking coffee\n";
    }
}
