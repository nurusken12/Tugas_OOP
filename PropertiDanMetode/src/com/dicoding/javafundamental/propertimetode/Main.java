package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args){

        // Kita tambahkan 1 argumen dengan nilai int 1
        // Nilai tesebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + kucing.getUmur());

        // Pehitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m))
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}
