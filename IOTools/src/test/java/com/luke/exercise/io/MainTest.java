package com.luke.exercise.io;

import org.junit.Test;

import java.io.IOException;

public class MainTest {


    @Test
    public void testExerciseOne() throws IOException {
        IOExerciseOne exerciseOne = new IOExerciseOne();
        exerciseOne.test();
    }

    @Test
    public void testExerciseTwo() {
        IOExerciseTwo exerciseTwo = new IOExerciseTwo();
        exerciseTwo.test("E:\\git\\IOTools", 0);
    }

}
