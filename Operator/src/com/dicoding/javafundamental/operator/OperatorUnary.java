package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args){
        System.out.println("Oeator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operato Unary Minus");
        int nilaiawal2 = 5;
        nilaiawal2 = -nilaiawal2;
        System.out.println("Hasil -5 = " + nilaiawal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 pount");
        int nilaiawal3 = 5;
        nilaiawal3++;
        System.out.println("Hasil 5++ = " +nilaiawal3);
        System.out.println();

        System.out.println("Operator Pengurangan nilai sebesar 1 poin");
        int nilaiawal4 = 5;
        nilaiawal4--;
        System.out.println("Hasil 5-- = " + nilaiawal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses adalah false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();
    }
}
