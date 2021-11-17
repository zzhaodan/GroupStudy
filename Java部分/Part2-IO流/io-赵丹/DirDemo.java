package com.zhaodan.java.basic.io;

import java.io.File;

/**
 * @program: 遍历
 * @description:
 * @author: zhaodan
 * @create: 2021-11-10:54
 **/
public class DirDemo {
    public static void main(String[] args) {
        File dir = new File("D://FileDemo");
        printDir(dir);
    }
    public static void printDir(File dir){
        System.out.println(dir);
        int num =0;

        File[] files = dir.listFiles(file -> {
            if(file.isDirectory()){
                return true;
            }
            return file.getName().toLowerCase().endsWith("jpg")||
                    file.getName().toLowerCase().endsWith("jpg")||
                    file.getName().toLowerCase().endsWith("jpg")||
                    file.getName().toLowerCase().endsWith("jpg");
        });


        for (File file: files){
            if(file.isFile()){
                System.out.println(file);
                num++;
            }else{
                printDir(file);
            }
        }
        System.out.println("一共有："+num+"图片");
        System.out.println("图片大小:"+dir.length()+"KB");
    }
}
