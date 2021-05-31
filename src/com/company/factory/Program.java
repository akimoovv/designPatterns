package com.company.factory;

public class Program {

    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloperFactory().createDeveloper();
        Developer cppDeveloper = new CppDeveloperFactory().createDeveloper();

        javaDeveloper.writeCode();
        cppDeveloper.writeCode();
    }
}
