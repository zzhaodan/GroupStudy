package com.zhaodan.java.basic.io;

import java.io.File;
import java.io.FileFilter;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: zhaodan
 * @create: 2021-11-11:33
 **/
public class Test1 {
    public static void main(String[] args) {
        File filedir = new File("D:/FileDemo");
        printdir(filedir);
        System.out.println("图片总数："+Test1.count);

    }
    static int count=0;
    public static void printdir(File dir){
        System.out.println(dir);
        File[] files =dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }
                String a=pathname.getName().toLowerCase();
                return  a.endsWith("jpg");
            }
        });

        for (File file:files){
            if(file.isFile()){
                count++;
                System.out.print(file);
                System.out.println(file+"  图片大小："+file.length());
            }else {
                printdir(file);
            }
        }

    }
}
