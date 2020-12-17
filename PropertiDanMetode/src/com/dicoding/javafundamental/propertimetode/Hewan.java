package com.dicoding.javafundamental.propertimetode;

public class Hewan {

    // Properti atau fields
    // Inisiasi dengan niali inisial
    double tinggi = 40;
    double berat = 4;

    // Inisiasi melalui konstruktor
    int umur;

    //konstruktor dengan parameter
    Hewan(int umur){
        this.umur = umur;
    }
    void lari(){
        System.out.println("Berlari dengan sangat cerdas");
    }

    void jalan(){
        System.out.println("Berjalan dengan Pelan..");
    }

    void  makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }
    double getBerat(){
        return berat;
    }
    double getTinggi(){
        return tinggi;
    }
    int getUmur(){
        return umur;
    }
}
