package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String filePath = r.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        ArrayList<Integer> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (Integer.parseInt(line) % 2 == 0)
            list.add(Integer.parseInt(line));
        }
        Collections.sort(list);
        r.close();
        reader.close();
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
