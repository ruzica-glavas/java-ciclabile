package org.lessons.java.array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ElencoInt numeri = new ElencoInt(new int[]{5,4,7,6});

        System.out.println(numeri.getElementoSuccessivo());
        System.out.println(numeri.getElementoSuccessivo());
        System.out.println(numeri.getElementoSuccessivo());
        System.out.println(numeri.getElementoSuccessivo());
        
        System.out.println(numeri.hasAncoraElementi());

    }
}
