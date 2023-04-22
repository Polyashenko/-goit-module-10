package com.goit.module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String absolutePath = "D:\\Java\\GoIt\\untitled\\src\\main\\java\\GoIt\\module10\\file1.txt";
        File file = new File(absolutePath);

        if(!file.exists()) {
            throw new RuntimeException("File with name " + file.getName() + " not exist");
        }

        try (FileInputStream inputStream = new FileInputStream(absolutePath)) {
            int ch = inputStream.read();
            while (ch != -1) {
                System.out.println((char)ch);
                ch = inputStream.read();
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}