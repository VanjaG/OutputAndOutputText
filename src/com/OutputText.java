package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OutputText {
    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {

        String separator = File.separator;
        String path = "/home/vanja/Desktop\file.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

