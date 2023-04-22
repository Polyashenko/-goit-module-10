package com.goit.module10;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyJasonSimple {


    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("D:\\Java\\GoIt\\untitled\\src\\main\\java\\GoIt\\module10\\file2.txt"));

            String line;
            List<User> users = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                if (line.matches(".+ \\d+")) {
                    String[] parameters = line.split(" "); //  String[] words = line.split(" "); fori po words і кладу в map
                    User user = new User(parameters[0], Integer.parseInt(parameters[1]));
                    users.add(user);
                }
            }

            System.out.println(users);

            String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
            System.out.println(jsonInString);

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

