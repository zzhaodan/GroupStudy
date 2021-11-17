package com.zhaodan.java.basic.io;

import java.io.File;

/**
 * @program:  File类的构造方法
 * @description:
 * @author: zhaodan
 * @create: 2021-11-18:56
 **/
public class FileConstructor {
    public static void main(String[] args) {
        // 文件路径名
        String pathname = "D:/FileDemo/aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1);
        // 通过父路径和子路径字符
        String parent = "D:/FileDemo/aaa";
        String child1 = "bbb.txt";
        File file2 = new File(parent, child1);
        System.out.println(file2);

        // 通过父级File对象和子路径字符串
        File parentDir= new File("D:/FileDemo/aaa");
        String child2="bbb.txt";
        File file3 = new File(parentDir, child2);
        System.out.println(file3);
    }
}




