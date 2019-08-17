package main.Task04;

import java.util.Scanner;

public class BinToInt {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите число в бинарном виде и нажмите 'ВВОД':");
        String A= in.next();
        char[] B=A.toCharArray();
        System.out.println(B);
        int C=0;
        for (int i = B.length-1; i>=0; i--){
            if(B[i]=='1')
                C= (int) (C+Math.pow(2,i));
        }
        System.out.println("Ваше число в 10-чной записи:");
        System.out.println(C);
        //Перевод из 10-чной системы в 2-чную
        /*int A = in.nextInt();
        String B=" ";
        while (A!=0)
        {
            B=(A%2)+B;
            A=A/2;
        }
        System.out.println(B);*/
    }
}
