package main.Task11;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите строку: ");
        String row = in.nextLine();
        System.out.println("Вы ввели: "+row);
    }
}
