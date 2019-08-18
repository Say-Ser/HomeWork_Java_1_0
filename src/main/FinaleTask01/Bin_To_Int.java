package main.FinaleTask01;

import java.util.Scanner;

public class Bin_To_Int {
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

    }
}
