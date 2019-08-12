package main.Task16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintFile {
    public static void main(String[] args) {
        String s;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите имя файла: (test.txt)");
        String name = in.nextLine();
        try {
            try (BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\GitHub\\HomeWork_Java_1_0\\src\\main\\Task16\\" + name))) {
                try {
                    while ((s = BR.readLine()) != null) {
                        System.out.println(s);
                    }
                } finally {
                    BR.close();
                }
            }
        } catch (IOException exc) {
                System.out.println("Ошибка ввода-вывода: "+ exc);
            }
    }
}
