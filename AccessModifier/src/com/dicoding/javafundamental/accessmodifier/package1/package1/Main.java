package com.dicoding.javafundamental.accessmodifier.package1.package1;

import com.dicoding.javafundamental.accessmodifier.package1.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        System.out.println(kelasA.functionB());

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}