## Esercizio 2: Pila Ordinata

L'obiettivo di questo esercizio è implementare un algoritmo per l'ordinamento di una pila in Java. La pila conterrà elementi di tipo numerico e l'ordinamento dovrà avvenire in ordine crescente. Verrà utilizzato l'algoritmo di ordinamento "SelectionSort" per completare l'esercizio.

Istruzioni:
1. Definire una classe chiamata "PilaOrdinata" che includa un metodo principale "main".
2. All'interno del metodo "main", creare una pila utilizzando una struttura di dati appropriata (ad esempio, una array o un ArrayList).
3. Popolare la pila con alcuni valori di esempio di tipo numerico (interi).
4. Implementare un metodo chiamato "ordinamentoPila" che prenda in input la pila da ordinare.
5. All'interno del metodo "ordinamentoPila", utilizzare l'algoritmo di ordinamento "SelectionSort" per ordinare gli elementi nella pila.
6. Infine, stampare la pila ordinata sullo schermo per verificarne il corretto ordinamento.

L'algoritmo di ordinamento "SelectionSort" seleziona iterativamente l'elemento minimo dalla porzione non ordinata della pila e lo sposta alla sua corretta posizione nella porzione ordinata. Si ripete questo processo fino a quando la pila è completamente ordinata.

Suggerimenti:

* È possibile utilizzare un'altra pila o una struttura di dati ausiliaria per facilitare l'ordinamento.
* Si consiglia di implementare metodi ausiliari, se necessario, per semplificare il codice e migliorarne la leggibilità.

Esempio di output desiderato:

Pila originale: [4, 2, 9, 5, 1]

Pila ordinata: [1, 2, 4, 5, 9]