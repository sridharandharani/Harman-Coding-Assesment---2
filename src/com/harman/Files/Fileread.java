package com.harman.Files;

import java.io.FileInputStream;
import java.io.IOException;
public class Fileread {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("data.txt");
            int i = 0;
            int count[] = new int[5];
            while ((i=file.read()) != -1)
            {
                String result = String.valueOf((char)i);
                for (int j =0 ; j < result.length();j++){
                    if (result.charAt(j) == 'A'){
                        count[0]++;
                    }
                    if (result.charAt(j) == 'E'){
                        count[1]++;
                    }
                    if (result.charAt(j) == 'I'){
                        count[2]++;
                    }
                    if (result.charAt(j) == 'O'){
                        count[3]++;
                    }
                    if (result.charAt(j) == 'U'){
                        count[4]++;
                    }
                }
            }
            System.out.println("Count of vowel 'A' is "+count[0]);
            System.out.println("Count of vowel 'E' is "+count[1]);
            System.out.println("Count of vowel 'I' is "+count[2]);
            System.out.println("Count of vowel 'O' is "+count[3]);
            System.out.println("Count of vowel 'U' is "+count[4]);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

