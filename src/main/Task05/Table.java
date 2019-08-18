package main.Task05;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите целое число и нажмите 'ВВОД':");
        int X=in.nextInt();
        System.out.println("Таблица умножения числа "+X+":");
        System.out.println(X+"x1="+ X);
        System.out.println(X+"x2="+X*2);
        System.out.println(X+"x3="+X*3);
        System.out.println(X+"x4="+X*4);
        System.out.println(X+"x5="+X*5);
        System.out.println(X+"x6="+X*6);
        System.out.println(X+"x7="+X*7);
        System.out.println(X+"x8="+X*8);
        System.out.println(X+"x9="+X*9);
        System.out.println(X+"x10="+X*10);
    }
}
