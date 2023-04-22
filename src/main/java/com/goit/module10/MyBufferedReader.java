package com.goit.module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("D:\\Java\\GoIt\\untitled\\src\\main\\java\\GoIt\\module10\\file1.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.matches("\\d{3}-\\d{3}-\\d{4}") || line.matches("\\(\\d{3}\\) \\d{3}-\\d{4}")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error : " + e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error : " + e);
            }
        }
    }
}