package com.zhaodan.java.basic.io;

import java.io.File;
import java.io.IOException;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: zhaodan
 * @create: 2021-11-09:19
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        File filedir = new File("D:/FileDemo");
        if(!filedir.exists()){
            filedir.mkdirs();
        }
        File file = new File("D:/FileDemo/hello.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        //判断是否为文件
        System.out.println(file.isFile());
        //文件大小
        System.out.println("hello文件大小："+file.length());
        //绝对路径
        System.out.println(file.getAbsolutePath());
        //文件名
        System.out.println(file.getName());
        //父路径
        System.out.println(file.getParentFile());


    }
}
