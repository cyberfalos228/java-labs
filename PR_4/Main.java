package com.mishchenko.main;

import com.mishchenko.reader.Reader;
import com.mishchenko.writer.Writer;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Writer writer = new Writer();

        double number = reader.readNumberFromConsole();
        String line = reader.readLineFromConsole();

        writer.write(line);
        writer.write(number);
    }
}
