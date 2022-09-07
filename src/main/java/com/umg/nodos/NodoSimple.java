package com.umg.nodos;

/**
 *
 * @author Rosalba Peralta
 */

public class NodoSimple {
    private int num;
    private String desc;
    private NodoSimple siguiente;

    public NodoSimple (int num, String desc){
        this.num = num;
        this.desc = desc;
        this.siguiente = null;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

}

