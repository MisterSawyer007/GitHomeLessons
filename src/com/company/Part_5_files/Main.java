package com.company.Part_5_files;

import java.io.IOException;
import java.io.File; // создавать файл
import java.io.PrintWriter; // писать в файл
import java.io.BufferedReader; // читать из файла
import java.io.FileReader; // читать из файла

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            File file = new File("newFile.txt"); // создание файла

            // Проверка, что файл уже существует, есть есть пишем в него
            if (!file.exists()) {
                System.out.println("Создали новый файл");
                file.createNewFile();
            } else {
                System.out.println("Пишем в старый файл");
            }

            PrintWriter pw = new PrintWriter(file); // писатель
            pw.println("Everything is working");
            pw.println("Hello world");
            pw.close();

            br = new BufferedReader(new FileReader("newFile.txt")); // читатель
            String line; // создаем строку, будем cчитывать по одной строке
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error:" + e);
            }
//            new File("newFile.txt").delete(); // удалить файл
        }
    }
}
