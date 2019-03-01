package com.luke.exercise.io;

import java.io.File;

/**
 * 递归实现输入任意目录，列出文件以及文件夹
 */
public class IOExerciseTwo {
    private static final String relation = "|\\";

    public void test(String filePath, int level) {
        File root = new File(filePath);
        if (root.isFile()) {
            System.out.println(spaceGenerator(level) + relation + root.getName());
        } else {
            for (File file : root.listFiles()) {
                test(file.getAbsolutePath(), ++level);
            }
        }
    }

    public String spaceGenerator(int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append("  ");
        }
        return buffer.toString();
    }
}
