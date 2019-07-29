package main.Task15;

import java.util.Random;
import java.util.Scanner;

public class SortBuble {
    public static void main(String[] args) {
        int size;
        Random random=new Random();
        Scanner in= new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        size= in.nextInt();
        int mass[]=new int[size];
        for (int i=0;i<size;i++)
        {
            mass[i] = random.nextInt(20);
        }
        System.out.println("Ваш массив:");
        for (int i=0;i<size;i++) {
            System.out.print(mass[i]+" ");
        }
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j <size-1 ; j++){
                if( mass[j] > mass[j+1] ){
                int tmp = mass[j];
                mass[j] = mass[j+1];
                mass[j+1] = tmp;
            }
        }
    }
        System.out.println("Ваш массив отсортирован:");
        for (int i=0;i<size;i++)
            System.out.print(mass[i] + " ");
    }
}
