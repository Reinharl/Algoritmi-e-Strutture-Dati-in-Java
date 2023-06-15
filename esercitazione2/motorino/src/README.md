## Esercizio 2: Motorino

Scrivere la classe Motorino che ha i seguenti attributi:
* colore: una stringa indicante il colore del motorino,
* velocità: un numero con la virgola indicante la velocità in Km/h che possiede il motorino,
* tipo: una stringa indicante la marca e il modello del motorino es. "Piaggio scarabeo",
* antifurto: un boolean che indica se è stato inserito l'antifurto (ha un valore iniziale pari a false).

Implementare i metodi getter e setter per ogni attributo,
* scrivere il metodo getVelocita che restituisce la velocità del motorino,
* scrivere inoltre il metodo accelera che ha come parametro un numero con la virgola indicante i Km/h che si vogliono aggiungere alla velocità, il metodo verifica il valore dell'attributo se è false aggiunge il valore del parametro all'attributo velocità, altrimenti non fa nulla.
* scrivere il metodo inserisciAntifurto che assegna un valore true all'attributo antifurto;

Nel Main caricare i dati da tastiera, creare l'oggetto e simulare il comportamento (output standard).