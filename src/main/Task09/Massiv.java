package main.Task09;

import java.util.Scanner;
public class Massiv {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = in.nextInt();
        int mass[]=new int[size];
        System.out.println("Введите элементы массива через пробел: ");
        for (int i:mass
             ) {
            mass[i]=in.nextInt();
            System.out.print(mass[i]*2+" ");
        }
    }
}
