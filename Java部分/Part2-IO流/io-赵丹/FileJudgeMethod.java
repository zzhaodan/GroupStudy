package com.zhaodan.java.basic.io;

import java.io.File;

/**
 * @program: File类的判断方法
 * @description:
 * @author: zhaodan
 * @create: 2021-11-19:17
 **/
public class FileJudgeMethod {
    public static void main(String[] args) {
        File f = new File("/D:/FileDemo/bbb.java");
        File f2 = new File("D:/FileDemo/aaa");
        // 判断是否存在
        System.out.println("D:/FileDemo/bbb.java 是否存在:"+f.exists());
        System.out.println("D:/FileDemo/aaa 是否存在"+f2.exists());
        // 判断是文件还是目录
        System.out.println("D:/FileDemo/aaa 是文件?:"+f2.isFile());
        System.out.println("D:/FileDemo/aaa 是目录?:"+f2.isDirectory());
    }
}




