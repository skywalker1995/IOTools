package com.luke.demo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Demo {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File test = new File("test.txt");
        File answer = new File("answer.txt");
        DataOutputStream dosTest = new DataOutputStream(new FileOutputStream(test));
        DataOutputStream dosAnswer = new DataOutputStream(new FileOutputStream(answer));
        test.createNewFile();
        answer.createNewFile();
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(100);
            dosTest.writeChars("Decimal:"+x+" Binary=, Octal=, Hexadecimal=");
            dosTest.writeChars("\n\n");
            dosAnswer.writeChars("Decimal:"+x+" Binary="+toBinary(x)+", Octal="+toOctal(x)+", Hexadecimal="+toHex(x)+"");
            dosAnswer.writeChars("\n\n");
        }

    }

    //十进制-->十六进制。
    public static String toHex(int num) {
        return trans(num, 15, 4);
    }

    //十进制-->二进制。
    public static String toBinary(int num) {
        return trans(num, 1, 1);
    }

    //十进制-->八进制。
    public static String toOctal(int num) {
        return trans(num, 7, 3);
    }

    public static String trans(int num, int base, int offset) {

        StringBuffer buffer = new StringBuffer();
        if (num == 0) {
            return "0";
        }
        //定义一个对应关系表。
        char[] chs = {'0', '1', '2', '3',
                '4', '5', '6', '7',
                '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F'};
		/*
		一会查表会查到比较的数据。
		数据一多，就先存储起来，在进行操作。
		所以定义一个数组。 临时容器。
		*/
        char[] arr = new char[32];
        int pos = arr.length;

        while (num != 0) {
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }

        for (int x = pos; x < arr.length; x++) {
            buffer.append(arr[x]);
        }
        return buffer.toString();
    }
}
