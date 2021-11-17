package com.zhaodan.java.basic.io;

import java.io.File;
import java.io.IOException;

/**
 * @program: File的创建和删除方法
 * @description:
 * @author: zhaodan
 * @create: 2021-11-19:22
 **/
public class FileCreateDelete {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("aaa.txt");
        System.out.println("是否存在:"+f.exists());
        System.out.println("是否创建:"+f.createNewFile());
        System.out.println("是否存在:"+f.exists());

        // 目录的创建
        File f2 = new File("newDir");
        System.out.println("是否存在:"+f2.exists());
        System.out.println("是否创建:"+f2.mkdirs());
        System.out.println("是否存在:"+f2.exists());
        // 文件的删除
         System.out.println(f.delete());
         // 目录的删除
        System.out.println(f2.delete());
    }
}


