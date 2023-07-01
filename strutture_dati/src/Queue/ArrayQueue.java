package Queue;

import java.util.ArrayList;

/**
 * Una raccolta di oggetti che vengono inseriti e eliminati secondo il principio
 * first-in first-out.
 */
public class ArrayQueue<E> {
    private ArrayList<E> array = new ArrayList<>();
    private int size = 0;

    // Costruttore
    public ArrayQueue() {
    }

    /**
     * Restituisce il numero di elementi presenti nella coda.
     *
     * @return il numero di elementi presenti nella coda
     */
    public int size() {
        return size;
    }

    /**
     * Verifica se la coda è vuota.
     *
     * @return true se e solo se la coda è vuota
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Aggiunge l'elemento in fondo alla coda.
     *
     * @param e l'elemento da inserire
     */
    public void enqueue(E e) {
        array.add(e);
        size++;
    }

    /**
     * Restituisce il primo elemento della coda, senza eliminarlo
     *
     * @return il primo elemento della coda (o null se la coda è vuota)
     */
    public E first() {
        if (!isEmpty()) {
            return array.get(0);
        } else {
            return null;
        }
    }

    /**
     * Elimina e restituisce il primo elemento della coda.
     *
     * @return l'elemento eliminato (o null se la coda è vuota)
     */
    public E dequeue() {
        if (!isEmpty()) {
            E answar = array.get(0);
            array.remove(0);
            size--;
            return answar;
        } else {
            return null;
        }
    }

}
