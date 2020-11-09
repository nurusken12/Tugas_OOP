package com.dicoding.javafundamental.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char input = 'C';
        int output = 10;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
}
