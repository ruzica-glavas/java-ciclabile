package org.lessons.java.array;

public class ElencoInt {
    private int[] numeriInt;
    private int posizione;

    //Costruttore

    public ElencoInt(int[] numeriInt){
        this.numeriInt=numeriInt;
        posizione=0;
    }

    //Metodi
    public int getElementoSuccessivo(){
        return numeriInt[posizione++];
    };

    public boolean hasAncoraElementi(){
        return posizione < numeriInt.length;
    }
    
}
