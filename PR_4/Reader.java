package com.mishchenko.reader;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public double readNumberFromConsole() {
        System.out.print("Введіть число: ");
        return scanner.nextDouble();
    }

    public String readLineFromConsole() {
        System.out.print("Введіть рядок: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
}
