package main.Task13;

import java.util.Scanner;

public class EqString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String st1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String st2 = in.nextLine();
        if(st1.length()==st2.length()){
            System.out.println("Длины ваших строк равны.");
        }
        else {
            if(st1.length()>st2.length())
                System.out.println(st1);
            else System.out.println(st2);
            }
        }
}
