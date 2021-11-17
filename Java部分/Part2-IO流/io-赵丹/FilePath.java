package com.zhaodan.java.basic.io;

import java.io.File;

/**
 * @program: 绝对路径和相对路径
 * @description:
 * @author: zhaodan
 * @create: 2021-11-19:11
 **/
public class FilePath {
    public static void main(String[] args) {
        File f = new File("D:/FileDemo/hello.txt");
        System.out.println(f.getAbsolutePath());

        File f2 = new File("bbb.java");
        System.out.println(f2.getAbsolutePath());
    }

}
