package com.zhaodan.java.basic.io;

import java.io.File;
import java.util.Objects;

/**
 * @program: IntelliJ IDEA
 * @description: 遍历目录，获取所有的java文件
 * @author: zhaodan
 * @create: 2021-11-19:55
 **/
public class JavaFileFilter {
    public static void main(String[] args) {
        File dir = new File("D:/javastudy/java-basic/src/main/java/com/zhaodan/java/basic");

        File[] files = dir.listFiles(file -> {
            if (file.isDirectory()) {
                return true;
            }
            return file.getName().toLowerCase().endsWith("java");
        });
        //遍历files数组
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}

