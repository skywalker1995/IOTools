package com.luke.exercise.io;

import java.io.File;

/**
 * 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目
 * 录IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文
 * 件
 * <p>
 * 使用File类
 */
public class IOExerciseOne {
    public void test() {
        File hw = new File(System.getenv("user.dir") + "/HelloWorld.txt");
        if (hw.isFile()) {
            System.out.println("HW is a file.");
        } else {
            System.out.println("HW is a directory");
        }
        File ioTest = new File(System.getenv("user.dir") + "/IOTest");
        hw.renameTo(ioTest);
        for (String fileName : ioTest.list()) {
            System.out.println("File Name: " + fileName);
        }
    }

}
