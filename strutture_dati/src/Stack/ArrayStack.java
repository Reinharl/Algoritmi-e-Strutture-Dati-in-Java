package Stack;

import java.util.ArrayList;

/**
 * Una raccolta di oggetti che vengono inseriti e eliminati secondo il principio
 * last-in first-out.
 */
public class ArrayStack<E> {
    private ArrayList<E> array = new ArrayList<>();
    private int size = 0;

    // Costruttore
    public ArrayStack() {
    }

    /**
     * Restituisce il numero di elementi presenti nella pila.
     *
     * @return il numero di elementi presenti nella pila
     */
    public int size() {
        return size;
    }

    /**
     * Verifica se la pila è vuota.
     *
     * @return true se e solo se la pila è vuota
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Inserisce un elemento in cima alla pila.
     *
     * @param e l'elemento da inserire
     */
    public void push(E e) {
        array.add(e);
        size++;
    }

    /**
     * Restituisce l'elemento in cima alla pila, senza eliminarlo.
     *
     * @return l'elemento in cima alla pila (o null se la pila è vuota)
     */
    public E top() {
        if (!isEmpty()) {
            return array.get(size - 1);
        } else {
            return null;
        }
    }

    /**
     * Elimina e restituisce l'elemento che si trova in cima alla pila.
     *
     * @return l'elemento eliminato (o null se la pila è vuota)
     */
    public E pop() {
        if (!isEmpty()) {
            return array.get(--size);
        } else {
            return null;
        }
    }
}
