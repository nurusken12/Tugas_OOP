package com.dicoding.javafundamental.operator;

public class OperatorConditional {
    public static void main(String[] args){
        int value = 4;
        int anothervalue = 5;

        System.out.println("Conditional AND");
        boolean result = value == 3 && anothervalue == 5;
        boolean anotherResult = value != 3 && anothervalue == 5;

        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");

        result = value == 3 || anothervalue == 5;
        anotherResult = value !=3 || anothervalue == 5;

        System.out.println("Hasil Opeator OR pada syarat value == 3 dan anotherValue == 5 adala " +result);
        System.out.println("Hasil Opeator OR pada syarat value != 3 dan anotherValue == 5 adala " +anotherResult);
        System.out.println();
    }
}
