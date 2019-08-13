package main.Task18;

import java.io.*;
import java.util.Scanner;

public class Prov {
    public static void main(String[] args) {
        String s;
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла: (test.txt)");
        String name = in.nextLine();
        try {
            try (BufferedReader BR = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\GitHub\\HomeWork_Java_1_0\\src\\main\\Task18\\" + name))) {
                try {
                    while ((s = BR.readLine()) != null) {
                        System.out.println(s);
                        count++;
                    }
                } finally {
                    BR.close();
                }
            }
        } catch (
                IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        //Надо как то получить количество вводимых строк count будет их считать
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Измените необходимый текст: ");
        try(FileWriter fw= new FileWriter("C:\\Users\\user\\Documents\\GitHub\\HomeWork_Java_1_0\\src\\main\\Task18\\test.txt")) {
            do{
                s = BR.readLine();
                if(count==0) break;
                s=s+"\r\n";
                fw.write(s);
                count--;
            } while (count!=0);
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: "+ exc);
        }

    }
}