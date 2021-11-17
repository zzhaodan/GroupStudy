package zijieDemo;

import java.io.*;

public class Demo3 {
public static void main(String[] args) throws IOException {
        // 记录开始时间
        long start = System.currentTimeMillis();

        // 创建流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("jdk8.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.exe"));

        // 读写数据
        int len = 0;
        byte[] bytes = new byte[8*1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0 , len);}

        // 记录结束时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间:"+(end-start)+" 毫秒");
       }
}