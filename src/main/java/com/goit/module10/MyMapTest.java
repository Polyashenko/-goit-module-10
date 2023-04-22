package com.goit.module10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyMapTest {
    public static void main(String[] args) {
        BufferedReader reader = null;
        Map<String, Integer> map = new HashMap();
        try {
            reader = new BufferedReader(new FileReader("D:\\Java\\GoIt\\untitled\\src\\main\\java\\GoIt\\module10\\file3.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; ++i) {
                    Integer count = map.get(words[i]);
                    if (count == null) {
                        map.put(words[i], 1);
                    } else {
                        map.put(words[i], ++count);
                    }
                }
            }
            System.out.println(map);
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
