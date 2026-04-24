package com.mishchenko.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write(String text) {
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write(text + "\n");
            System.out.println("Рядок записано у файл: " + text);
        } catch (IOException e) {
            System.out.println("Помилка запису: " + e.getMessage());
        }
    }

    public void write(double number) {
        double result = Math.sqrt(number);
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write("Квадратний корінь: " + result + "\n");
            System.out.println("Квадратний корінь записано у файл: " + result);
        } catch (IOException e) {
            System.out.println("Помилка запису: " + e.getMessage());
        }
    }
}
