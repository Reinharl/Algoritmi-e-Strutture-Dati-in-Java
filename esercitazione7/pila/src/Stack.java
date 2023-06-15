/**
 * Una raccolta di oggetti che vengono inseriti e eliminati secondo il principio
 * last-in first-out.
 */
public interface Stack<E> {

    /**
     * Restituisce il numero di elementi presenti nella pila.
     *
     * @return il numero di elementi presenti nella pila
     */
    int size();

    /**
     * Verifica se la pila è vuota.
     *
     * @return true se e solo se la pila è vuota
     */
    boolean isEmpty();

    /**
     * Inserisce un elemento in cima alla pila.
     *
     * @param e l'elemento da inserire
     */
    void push(E e);

    /**
     * Elimina e restituisce l'elemento che si trova in cima alla pila.
     *
     * @return l'elemento eliminato (o null se la pila è vuota)
     */
    E pop();

    /**
     * Restituisce l'elemento in cima alla pila, senza eliminarlo.
     *
     * @return l'elemento in cima alla pila (o null se la pila è vuota)
     */
    E top();


}
