package com.dicoding.javafundamental.inputOuput;
import java.util.Scanner;

public class InputOuputFunction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukkan Angka Pertama : ");
        int value = scanner.nextInt();
        System.out.print("Masukan Angka kedua :");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasil adalah : " + result);

    }
}
