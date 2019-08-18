package main.FinaleTask02;

import java.util.Random;
import java.util.Scanner;

public class SortMass {
    public static void main(String[] args) {
        int size;
        Random random=new Random();
        Scanner in= new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        size= in.nextInt();
        int[] mass =new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i=0;i<size;i++)
        {
            mass[i] = in.nextInt();
        }
        System.out.println("Ваш массив:");
        for (int i=0;i<size;i++) {
            System.out.print(mass[i]+" ");
        }
        // Сортировка выбором
        for(int min=0;min<size-1;min++){
            int least=min;
            for (int j=min+1;j<size;j++){
                if(mass[j]<mass[least])
                    least=j;
            }
            int tmp=mass[min];
            mass[min]=mass[least];
            mass[least]=tmp;
        }
        //----------------------
        System.out.println("Ваш массив отсортирован по возрастанию:");
        for (int i=0;i<size;i++) {
            System.out.print(mass[i]+" ");
        }

    }
}
