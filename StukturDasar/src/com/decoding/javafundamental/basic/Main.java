package com.decoding.javafundamental.basic;

import com.decoding.javafundamental.basic.kendaraan.Kereta;
import com.decoding.javafundamental.basic.kendaraan.Mobil;
import com.decoding.javafundamental.basic.kendaraan.Motor;
import com.decoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
public static void main (String[] args){
    System.out.println("hello World!");

    Gitar.bunyi();
    Mobil.JumlahBan();
    Motor.JumlahBan();
    Kereta.JumlahBan();

    Date today = new Date();
    System.out.println("Hari ini = "+ today);
    Date tomorow = DateUtils.addDays(today, 1);
    System.out.println("Besok = " + tomorow);
}
}
