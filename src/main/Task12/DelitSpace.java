package main.Task12;

import java.util.Scanner;

public class DelitSpace {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите строку с пробелами: ");
        String row = in.nextLine();
        String[] LostSpace=row.split(" ");
        System.out.println("Ваша строка без пробелов: ");
        for (String s : LostSpace) System.out.print(s);
    }
}
