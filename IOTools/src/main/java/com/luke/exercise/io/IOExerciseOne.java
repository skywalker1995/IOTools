package com.luke.exercise.io;

import java.io.File;
import java.io.IOException;

/**
 * 在电脑D盘下创建一个文件为HelloWorld.txt文件，判断他是文件还是目录，在创建一个目录
 * IOTest,之后将HelloWorld.txt移动到IOTest目录下去；之后遍历IOTest这个目录下的文件
 * <p>
 * 使用File类
 */
public class IOExerciseOne {
    public void test() throws IOException {
        File hw = new File(System.getProperty("user.dir") + "/HelloWorld.txt");
        hw.createNewFile();
        if (hw.isFile()) {
            System.out.println("HW is a file.");
        } else {
            System.out.println("HW is a directory");
        }
        File ioTest = new File(System.getProperty("user.dir") + "/IOTest");
        ioTest.mkdir();
        hw.renameTo(new File(ioTest.getAbsolutePath() + File.separator + hw.getName()));
        for (String fileName : ioTest.list()) {
            System.out.println("File Name: " + fileName);
        }
        if (hw.exists()) {
            hw.delete();
            System.out.println("HW file is deleted successful");
        }
        if (ioTest.exists()) {
            ioTest.delete();
            System.out.println("IOTest folder is deleted successful");
        }
    }
}
