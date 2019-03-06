package com.luke.pattern.decorator.Impl;

import com.luke.pattern.decorator.SchoolReport;

public class RealSchoolReport implements SchoolReport {

    @Override
    public void report() {
        System.out.println("Math: 90, English: 70, Nature: 80");
    }

    @Override
    public void sign(String name) {
        System.out.println("Parent Name: " + name);
    }
}
