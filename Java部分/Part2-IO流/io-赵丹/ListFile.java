package com.zhaodan.java.basic.io;

import java.io.File;
import java.util.Objects;

/**
 * @program:  File类目录遍历方法
 * @description:
 * @author: zhaodan
 * @create: 2021-11-19:41
 **/
public class ListFile {
    public static void main(String[] args) {
        File dir = new File("D:\\javastudy");
        //获取当前目录下的文件以及文件夹对象，通过文件对象可以获取更多信息
        File[] files = dir.listFiles();
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file);
        }
    }
}

