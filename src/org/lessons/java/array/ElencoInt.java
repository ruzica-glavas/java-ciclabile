package org.lessons.java.array;

public class ElencoInt {
    private int[] numeriInt;
    private int posizione;

    //Costruttore

    public ElencoInt(int[] elenco){
        this.numeriInt=elenco;
        if(this.numeriInt.length>0){
            this.posizione=0;
        } 
    }

    //Metodi
    public int getElementoSuccessivo(){
        int elemento=numeriInt[posizione];
        posizione++;
        return elemento;
    };

    public boolean hasAncoraElementi(){
        if(numeriInt.length==0){
            return false;
        }
        return posizione < this.numeriInt.length;
    }


    //Bonus
    public ElencoInt(){
        this.numeriInt=new int[0];
    }

    public void addElement(int addElement){
        int[] newArray = new int[numeriInt.length+1];

            for(int i=0; i<numeriInt.length; i++){
                newArray[i] = numeriInt[i];
        }

        newArray[this.numeriInt.length] = addElement;
        this.numeriInt = newArray;
    
    }


}
