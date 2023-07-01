package Array;

/**
 * Una raccolata di oggetti di dimensione dinamica.
 */
public class Array<E> {
    private E[] array = (E[]) new Object[0];
    private int size = 0;

    // Costruttore
    public Array() {
    }

    /**
     * Restituisce il numero di elementi presenti nel vettore.
     *
     * @return il numero di elementi presenti nel vettore.
     */
    public int size() {
        return size;
    }

    /**
     * Verifica se il vettore è vuota.
     *
     * @return true se e solo se il vettore è vuoto
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Restituisce l'elemento nella posizione index (o null se il vettore è vuoto).
     *
     * @param index è la posizione dell'elemento nell'vettore
     * @return l'elemento nella posizione index del vettore.
     */
    public E get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return null;
        }
    }

    /**
     * Aggiunge l'elemento in fondo al vettore O(n).
     *
     * @param e l'elemento da inserire
     */
    public void add(E e) {
        E[] newArray = (E[]) new Object[++size];

        for (int i = 0; i < size - 1; i++) {
            newArray[i] = array[i];
        }

        newArray[size - 1] = e;

        array = newArray;
    }

    /**
     * Rimuove l'elemento dalla posizione index (se esiste) O(n).
     *
     * @param index la posizione dell'elemento da rimuovere
     */
    public void remove(int index) {
        if (index >= 0 && index < size && !isEmpty()) {
            E[] newArray = (E[]) new Object[--size];

            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }

            for (int i = index; i < size; i++) {
                newArray[i] = array[i + 1];
            }

            array = newArray;
        }
    }

}
