# AiJava
Mediante il sito [CodingTechRoom](https://codingtechroom.com/tutorial/java-ultimate-guide-to-setting-up-a-java-project-for-ai-development) 
si ricrea una serie di algoritmi legati all'intelligenza artificiale, documentando passo passo e cercando di fare dei piccoli esempi da 
poterli utilizzare in contesti reali.

## Regressione lineare

La regressione lineare è una tecnica statistica utilizzata per modellare la relazione tra una variabile dipendente 
(detta variabile target o risposta) e una o più variabili indipendenti (dette predittori o feature). 
L'obiettivo è trovare una linea (o un piano, se ci sono più variabili) che meglio descriva come i predittori influenzano 
la variabile target.

La linea è descritta da un'equazione del tipo: y=mx+b, dove:
- y è la variabile dipendente,
- x è la variabile indipendente,
- m è la pendenza (coefficiente angolare),
- b è l'intercetta (il valore di y quando x=0).

La regressione lineare è molto utile perché consente non solo di descrivere relazioni esistenti tra le variabili, ma anche di fare previsioni.

### Esempio 1: Una pizzeria (azienda di piccole dimensioni)

Una pizzeria vuole capire come diversi fattori influenzano il numero di pizze vendute giornalmente.

**Obiettivo**: Determinare quali variabili influiscono di più sulle vendite e prevedere il numero di pizze da preparare per 
minimizzare sprechi.

**Variabile indipendente y**: Numero di pizze vendute al giorno.

**Variabili indipendenti**: 
- Temperatura media del giorno
- Giorni della settimana 
- Budget speso per la pubblicità
- Offerte o promozioni in corso

*Utilizzo della regressione lineare:*
- Raccogliere dati storici
- Usare un algoritmo di regressione lineare per stimare la relazione tra queste variabili e il numero di pizze vendute
- Applicare il modello per fare previsioni (es. quante pizze preparare il prossimo sabato se si prevede una certa temperatura e si sta promuovendo uno sconto)

### Esempio 2: Azienda di produzione di passate (azienda di medie dimensioni)
Un'azienda che produce passate di pomodoro vuole ottimizzare la produzione settimanale in base alla domanda prevista.

**Obiettivo**: Prevedere la quantità di passate da produrre per evitare costi di stoccaggio inutili e garantire la disponibilità di prodotto.

**Variabile indipendente y**: Quantità di passata venduta (in tonnellate).

**Variabili indipendenti**:
- Prezzo al dettaglio medio
- Periodo dell'anno
- Andamento delle vendite nei negozi partner
- Dati sulle campagne di marketing
- Prezzo dei pomodori

*Utilizzo della regressione lineare:*
- Analizzare i dati storici delle vendite e delle variabili sopra indicate.
- Addestrare un modello di regressione lineare per capire il peso di ciascun fattore nella previsione della domanda.
- Utilizzare il modello per pianificare la produzione per le settimane successive.

## Classificatore

Un classificatore è un modello di machine learning utilizzato per assegnare un'etichetta o una categoria a un dato in ingresso, 
basandosi su un set di dati preesistenti (dataset di addestramento) in cui ogni esempio è associato a una categoria nota.

Obiettivo:
- Prevedere la classe o categoria di un'istanza non etichettata.
- Classificare i dati in categorie discrete, come "Alta qualità" vs "Bassa qualità" o "Cliente frequente" vs "Cliente occasionale".

Funzionamento:
- Il classificatore analizza i dati di addestramento, cercando modelli o relazioni tra gli attributi (variabili indipendenti) e la classe (variabile dipendente).
- Una volta addestrato, può essere utilizzato per prevedere la classe di nuove istanze.

Tipi di Classificatori:
- Albero decisionale (J48): Crea un albero basato su regole decisionali. È interpretabile e utile per scenari semplici.
- Naive Bayes: Modello probabilistico basato sul teorema di Bayes. È veloce e adatto a problemi con dati categoriali.
- Support Vector Machine (SVM): Crea un confine decisionale ottimale tra classi. Utile per problemi complessi con dati numerici.
- Random Forest: Una collezione di alberi decisionali che migliorano la precisione e la generalizzazione.

Output del Classificatore:
- Classe Predetta: La categoria dell'istanza.
- Probabilità: (Opzionale) La probabilità che un'istanza appartenga a ciascuna classe.

Applicazioni Comuni:
- Marketing: Segmentazione dei clienti per inviare offerte mirate.
- Produzione: Classificazione della qualità del prodotto per ottimizzare i processi.
- Sanità: Predizione di malattie sulla base di dati clinici.
- E-commerce: Classificazione dei prodotti in base alla domanda prevista.

### Esempio 1: Classificazione dei clienti di una pizzeria
Scenario: Una pizzeria vuole classificare i propri clienti in base al comportamento di acquisto per ottimizzare le promozioni.

**Dati Input**

Attributi (variabili indipendenti):
- Età del cliente.
- Frequenza settimanale degli ordini.
- Importo medio speso.
- Giorno preferito per gli ordini.

Classe da prevedere:
- Categoria del cliente 

Esempio:
```
Age,WeeklyOrders,AvgSpend,PreferredDay,Category
25,3,20,Friday,Frequente
40,1,15,Saturday,Occasionale
35,5,25,Friday,Frequente
50,0,0,None,Raro
```

### Esempio 2: Classificazione della qualità della passata di pomodoro

Scenario: Un'azienda produttrice di passate di pomodoro vuole classificare i lotti di produzione in base alla qualità per migliorare i processi produttivi.

**Dati Input**

Attributi (variabili indipendenti):
- Colore medio del lotto (RGB)
- Viscosità
- Percentuale di umidità.
- Livello di zucchero (°Brix).

Classe da prevedere:
- Categoria del lotto (es. "Alta qualità", "Media qualità", "Scarsa qualità").

Esempio:
```
ColorR,ColorG,ColorB,Viscosity,Moisture,SugarLevel,Quality
220,50,30,1.5,70,8.2,High
200,55,40,1.0,75,7.8,Medium
150,60,50,0.8,80,7.5,Low
```

##  Logistic Regression

La Logistic Regression è un algoritmo di machine learning per la classificazione binaria o multiclasse. Sebbene il nome 
suggerisca una "regressione", si tratta di un metodo di classificazione che utilizza una funzione logistica (o sigmoidale) 
per modellare la probabilità che un'osservazione appartenga a una determinata classe.

Immaginiamo di avere un set di dati che contiene alcune informazioni, come l'età di una persona, il reddito e il luogo 
di residenza, e vogliamo determinare se è probabile che questa persona acquisti un determinato prodotto. La logistic 
regression può aiutarci a costruire un modello che analizzi i dati storici (ad esempio, clienti che hanno già acquistato 
o meno il prodotto) e preveda se un nuovo cliente acquisterà o no.

- Relazione Lineare: L'algoritmo parte da un'idea semplice: crea una relazione lineare tra le variabili indipendenti (gli attributi, come età e reddito) e una variabile dipendente (ad esempio, "Acquista" o "Non acquista").
- Probabilità: Questa relazione viene poi trasformata in una probabilità usando una funzione chiamata sigmoide. Questa funzione prende un valore numerico qualsiasi e lo converte in un numero compreso tra 0 e 1, rappresentando la probabilità che un'osservazione appartenga a una certa classe. Per esempio, se un cliente ha una probabilità del 0,8 (80%) di acquistare un prodotto, possiamo classificarlo come "Acquirente".
- Decisione: Una volta calcolata la probabilità, il modello decide in quale classe posizionare l'osservazione. Per una classificazione binaria (ad esempio, "Sì" o "No"), viene utilizzata una soglia, solitamente 0,5: se la probabilità è maggiore di 0,5, il cliente è classificato come "Acquirente"; altrimenti, come "Non acquirente".

La logistic regression è particolarmente utile quando abbiamo un problema di classificazione semplice, e vogliamo anche 
capire le relazioni tra i dati. A differenza di altri algoritmi più complessi, come le reti neurali, è facile da interpretare: 
ci permette di sapere quale variabile ha un peso maggiore nella decisione finale. Ad esempio, se stiamo analizzando i fattori che influenzano l'acquisto di un prodotto, possiamo capire se l'età è più 
importante del reddito per prevedere il comportamento del cliente.

Non è adatta per problemi in cui la relazione tra gli attributi e la classe è non lineare. In questi casi, algoritmi 
come le reti neurali o gli alberi decisionali possono essere più efficaci. Inoltre, è sensibile agli outlier (valori 
anomali nei dati), quindi è importante pre-elaborare i dati prima di applicarla.

### Scenario 1: Pizzeria - Prevedere la risposta a una promozione

Una pizzeria vuole prevedere se un cliente risponderà a una promozione basandosi su:
- Età
- Frequenza settimanale di ordini
- Importo medio speso

Esempio di dataset:
```
Age,WeeklyOrders,AvgSpend,Responded
25,3,20,1
40,1,15,0
35,5,25,1
50,0,0,0
```

### Scenario 2: Produzione - Classificazione della Qualità

Un'azienda produttrice di passata vuole prevedere se un lotto sarà di alta qualità ("1") o bassa qualità ("0") basandosi su:
- Livello di zucchero (°Brix).
- Umidità
- Colore

Esempio di dataset:
```
Age,WeeklyOrders,AvgSpend,Responded
8.2,70,220,1
7.8,75,200,0
7.5,80,150,0
9.0,68,230,1
```
