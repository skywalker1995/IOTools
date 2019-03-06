package com.luke.pattern.decorator.Impl;

import com.luke.pattern.decorator.DecoratorSchoolReport;
import com.luke.pattern.decorator.SchoolReport;

public class HighScoreDecorator implements DecoratorSchoolReport {

    SchoolReport sp;

    public HighScoreDecorator(SchoolReport sp) {
        this.sp = sp;
    }

    @Override
    public void report() {
        reportHighScore();
        sp.report();
    }

    @Override
    public void sign(String name) {
        sp.sign(name);
    }

    public void reportHighScore() {
        System.out.println("The Highest score is Math 90.");
    }

}
