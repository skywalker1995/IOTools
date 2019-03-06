package com.luke.pattern.decorator.Impl;

import com.luke.pattern.decorator.DecoratorSchoolReport;
import com.luke.pattern.decorator.SchoolReport;

public class SortDecorator implements DecoratorSchoolReport {

    SchoolReport sp;

    public SortDecorator(SchoolReport sp) {
        this.sp = sp;
    }

    @Override
    public void report() {
        reportSort();
        sp.report();
    }

    @Override
    public void sign(String name) {
        sp.sign(name);
    }

    public void reportSort() {
        System.out.println("The sort is 20.");
    }
}
