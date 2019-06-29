package main.Task07;

import java.util.Scanner;

public class Const {
    public static void main(String[] args) {
        double number, X, Y, Z;
        X=6.23;
        Y=2.73;
        Z=3.14;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите число: ");
        number=in.nextDouble();
        if(number==X || number==Y ||number==Z){
           System.out.println("Данное значение имеется в константах");
        }
        else System.out.println("Такой константы нет!");
    }
}
