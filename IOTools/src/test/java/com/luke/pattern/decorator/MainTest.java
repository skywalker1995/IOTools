package com.luke.pattern.decorator;

import com.luke.pattern.decorator.Impl.HighScoreDecorator;
import com.luke.pattern.decorator.Impl.RealSchoolReport;
import com.luke.pattern.decorator.Impl.SortDecorator;
import org.junit.Test;

public class MainTest {

    @Test
    public void testDecorator() {
        SchoolReport sp = new RealSchoolReport();
        sp = new HighScoreDecorator(sp);
        sp = new SortDecorator(sp);
        sp.report();
        sp.sign("Luke");
    }
}
