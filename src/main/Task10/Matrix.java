package main.Task10;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите размерность матрицы (строк, столбцов): ");
        int row = in.nextInt();
        int col = in.nextInt();
        int matr[][]=new int[row][col];
        System.out.println("Введите элементы матрицы через пробел: ");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                matr[i][j]=in.nextInt();
            }

        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(matr[i][j]+" ");
            }
            System.out.print('\n');
        }


        for (int j=0;j<=row;j++)
        {
            System.out.print(matr[0][j]*3+" ");
        }
    }
}
