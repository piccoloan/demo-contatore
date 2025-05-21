# Contatore Multithread (senza sincronizzazione)

Questo è un semplice esempio in Java che dimostra l'uso di **thread multipli** per incrementare un contatore condiviso. Serve a evidenziare i problemi che possono sorgere **senza sincronizzazione** tra i thread.

## Descrizione

Il programma definisce:

- Una classe `Contatore` con un campo `valore` che può essere incrementato.
- Una classe `MioThread` che estende `Thread` e incrementa il contatore 1000 volte.
- Una classe `Main` che avvia due thread `MioThread`, entrambi lavorando sullo **stesso oggetto Contatore**.

Poiché il metodo `incrementa()` **non è sincronizzato**, i due thread possono sovrascrivere i valori dell’altro. Questo porta a un **comportamento non deterministico**: il valore finale potrebbe essere inferiore a 2000.