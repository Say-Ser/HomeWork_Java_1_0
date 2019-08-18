package main.FinaleTask03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertrValute {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("Введите текущий курс:");
        System.out.print("Курс доллара = ");
        float Kurs=in.nextFloat();
        System.out.println("Введите количество рублей:");
        float Rub=in.nextFloat();
        float Dollar = Rub / Kurs;
        System.out.println("Итого: "+ df.format(Dollar)+" долларов.");
    }
}
