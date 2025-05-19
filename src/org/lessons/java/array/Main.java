package org.lessons.java.array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ElencoInt numeri = new ElencoInt(new int[]{5,4,7,6});

        while (numeri.hasAncoraElementi()) {
            System.out.println(numeri.getElementoSuccessivo());
        }


        //Parte bonus
        ElencoInt newNumeri = new ElencoInt();

        newNumeri.addElement(10);
        newNumeri.addElement(25);

        while (newNumeri.hasAncoraElementi()) {
            System.out.println(newNumeri.getElementoSuccessivo());
        }
        

        


    }
}
