package org.lessons.java.array;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ElencoInt numeri = new ElencoInt(new int[]{5,4,7,6});

        while (numeri.hasAncoraElementi()) {
            System.out.println(numeri.getElementoSuccessivo());
        }

        ElencoInt elenco = new ElencoInt();

        elenco.addElement(10);
        elenco.addElement(25);

        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }
        

        


    }
}
