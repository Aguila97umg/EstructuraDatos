package com.umg.estructuras;

import com.umg.nodos.NodoSimple;

/**
 *
 * @author Rosalba Peralta
 */
public class ListaSimple {

    NodoSimple primero;

    public ListaSimple() {
        this.primero = null;
    }

    public void insertar(NodoSimple nuevo) {
        if (vacia()) {
            primero = nuevo;
        } else {
            NodoSimple aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void insertarEntre(int numNodoAnterior, NodoSimple nuevo) {
        if (vacia()) {
            return;
        }
        NodoSimple anterior = buscar(numNodoAnterior);
        if(anterior != null) {
            nuevo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevo);
        }
    }

    public NodoSimple buscar(int num) {
        if (vacia()) {
            return null;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            if (aux.getNum() == num) {
                return aux;
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public boolean actualizar(int num, String desc) {
        NodoSimple aux = buscar(num);
        if (aux == null) {
            return false;
        }
        aux.setDesc(desc);
        return true;
    }

    public boolean eliminarV1(int num) {
        if (vacia()) {
            return false;
        }
        if (primero.getNum() == num) {
            primero = primero.getSiguiente();
            return true;
        }
        NodoSimple anterior = primero;
        NodoSimple aux = primero.getSiguiente();
        while (aux != null) {
            if (aux.getNum() == num) {
                anterior.setSiguiente(aux.getSiguiente());
                return true;
            }
            anterior = aux;
            aux = aux.getSiguiente();
        }
        return false;
    }

    public boolean eliminarV2(int num) {
        if (vacia()) {
            return false;
        }
        if (primero.getNum() == num) {
            primero = primero.getSiguiente();
            return true;
        }
        NodoSimple aux = primero;

        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getNum() == num) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista Vacia");
            return;
        }
        NodoSimple aux = primero;
        while (aux != null) {
            System.out.println(aux.getNum());
            aux = aux.getSiguiente();
        }
    }

    public boolean vacia() {
        return primero == null;
    }

    public void MostrarPares() {
        System.out.println("Numeros Pares en la lista:");
        NodoSimple n;
        n = primero;
        while (n != null) {
            System.out.print(n.getNum() % 2 != 0 ? "" : " "+n.getNum());
            n = n.getSiguiente();
        }
        System.out.println("\n");
    }

    public void visualizar() {
        NodoSimple n;
        int k = 0;
        n = primero;
        while (n != null) {
            System.out.print(n.getNum() + " ");
            n = n.getSiguiente();
            k++;
            System.out.print((k % 15 != 0 ? " " : "\n"));
        }
    }

}

