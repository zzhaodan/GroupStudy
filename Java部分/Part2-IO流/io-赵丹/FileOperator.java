package com.zhaodan.java.basic.io;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: IntelliJ IDEA
 * @description: 文件操作练习
 * @author: zhaodan
 * @create: 2021-11-19:27
 **/
public class FileOperator {
    public static boolean isExist(String pathname) {

        File file = new File(pathname);
        return file.exists();
    }

    public static boolean createDir(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return false;
    }

    /**
     * 创建文件
     *
     * @param pathname 文件路径
     * @return 创建结果
     * @throws IOException
     */

    public static boolean createFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.createNewFile();
        }
        return false;
    }

    public static Properties getFileInfo(File file) {
        String fileName = file.getName();
        String filePath = file.getPath();
        String parentDir = file.getParent();
        long fileLength = file.length();
        Properties properties = new Properties();
        properties.setProperty("fileName", fileName);

        properties.setProperty("filePath", filePath);
        properties.setProperty("parentDir", parentDir);
        properties.setProperty("fileLength", String.valueOf(fileLength));
        return properties;
    }
        public static boolean deleteFile(String pathname) {
            File file = new File(pathname);
            if (file.exists()) {
                return file.delete();
            }
            return false;
        }
    }

