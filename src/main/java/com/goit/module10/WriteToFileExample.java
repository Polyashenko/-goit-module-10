package com.goit.module10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    private static final String ABSOLUTE_PATH = "D:\\Java\\GoIt\\untitled\\src\\main\\java\\GoIt\\module10\\file1.txt";

    public static void main(String[] args) {
        File file = new File(ABSOLUTE_PATH);


        try (FileOutputStream outputStream = new FileOutputStream(file)){
            String content = "This we will to a file\nHello World";


        } catch (IOException e) {
            System.err.println("EXCEPTION!!! " + e.getMessage());
        }


    }

}
