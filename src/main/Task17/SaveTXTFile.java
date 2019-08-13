package main.Task17;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveTXTFile {
    public static void main(String[] args) {
        String s;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания ввода введите строку 'stop' ");
        try(FileWriter fw= new FileWriter("C:\\Users\\user\\Documents\\GitHub\\HomeWork_Java_1_0\\src\\main\\Task17\\test.txt")) {
            do{
                System.out.print(": ");
                s = BR.readLine();
                if(s.compareTo("stop")==0) break;
                s=s+"\r\n";
                fw.write(s);
            } while (s.compareTo("stop")!=0);
        }catch (IOException exc){
            System.out.println("Ошибка ввода-вывода: "+ exc);
        }
    }
}
