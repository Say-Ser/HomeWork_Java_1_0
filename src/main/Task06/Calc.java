package main.Task06;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int x,y,z;
        float avg;
        Scanner in= new Scanner(System.in);
        System.out.println("Введите целые x, y, z : ");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        avg= (float)((x+y+z)/3.0);
        System.out.println("Среднее арифметическое x, y, z: " +avg) ;
        if ((int)avg/2>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
