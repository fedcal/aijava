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

## Random Forest Classifier
Il Random Forest Classifier è uno degli algoritmi di machine learning più potenti e versatili, utilizzato principalmente 
per compiti di classificazione e regressione. Si tratta di un ensemble method, che combina più modelli di base per ottenere 
previsioni più robuste e accurate.

Un Random Forest è un insieme (o ensemble) di alberi decisionali. Un albero decisionale è un modello che prende decisioni 
basate su una serie di condizioni sui dati di input (ad esempio, "Età > 40?", "Reddito > 50000?"). Tuttavia, un singolo 
albero decisionale potrebbe essere troppo suscettibile agli errori nei dati e agli overfitting (cioè imparare troppo bene 
i dettagli del training set, ma senza generalizzare bene su nuovi dati).

Per ovviare a questo problema, un Random Forest costruisce molteplici alberi decisionali, ciascuno costruito con un subset 
diverso dei dati originali, e le previsioni finali vengono aggregate dalla combinazione delle previsioni di tutti gli alberi. 
In particolare:

- Per problemi di classificazione, la classe predetta sarà quella che riceve il maggior numero di "voti" dagli alberi.
- Per problemi di regressione, la previsione finale è la media delle previsioni di tutti gli alberi.

Il Random Forest funziona seguendo questi passaggi principali:

1. **Bootstrap Aggregating (Bagging)**: Per costruire ciascun albero della foresta, il Random Forest utilizza un metodo chiamato bagging. 
   In pratica, per ogni albero decisionale, viene preso un campione casuale di dati (con ripetizione) dal dataset originale. 
   Questo significa che alcuni esempi del dataset potrebbero non essere inclusi in un particolare albero, mentre altri potrebbero 
   essere ripetuti. L'idea dietro il bagging è che se ogni albero "vede" solo una parte del dataset, gli errori di ogni singolo 
   albero non si propagano attraverso tutta la foresta.
2. **Selezione Casuale delle Caratteristiche (Features)**: Per ogni nodo di un albero decisionale, Random Forest non considera 
   tutte le caratteristiche (o variabili) disponibili, ma seleziona un sottoinsieme casuale di esse. Questo rende ogni albero 
   diverso dagli altri, anche se i dati sono gli stessi. Questo processo riduce ulteriormente la correlazione tra gli alberi 
   e aiuta a migliorare la diversità della foresta.
3. **Costruzione degli Alberi**: Ogni albero viene costruito in modo indipendente, utilizzando il dataset bootstrap e 
   le caratteristiche selezionate casualmente. I nodi dell'albero vengono creati separando i dati in base alla caratteristica 
   che meglio separa le classi nel nodo. La costruzione dell'albero continua finché non si raggiungono condizioni di arresto 
   predefinite, come la profondità massima dell'albero o quando il nodo non ha abbastanza dati per essere suddiviso ulteriormente.
4. **Aggregazione delle Previsioni**: Una volta che tutti gli alberi sono stati costruiti, il Random Forest fa delle previsioni: 
   - Classificazione: Ogni albero emette una "votazione" su quale classe appartiene un dato esempio, e la classe che ottiene 
     il maggior numero di voti dalla foresta è la predizione finale.
   - Regressione: Invece di voti, ogni albero fa una previsione numerica, e la previsione finale è la media delle previsioni 
     di tutti gli alberi.

### Vantaggi del Random Forest

1. Riduzione dell'Overfitting: Combinando molteplici alberi, Random Forest riduce la possibilità che uno specifico albero 
   si adatti troppo ai dettagli del dataset (overfitting).
2. Accuratezza Elevata: Grazie al processo di aggregazione, le previsioni di una Random Forest sono generalmente più 
   accurate rispetto a quelle di un singolo albero decisionale.
3. Robustezza: Anche se alcuni alberi nella foresta sono "deboli" o fanno errori, l'aggregazione dei risultati garantisce 
   che il modello nel suo insieme resti robusto.
4. Gestione di Dati Mancanti: Random Forest è abbastanza robusto nei confronti dei dati mancanti e può gestirli in modo efficace.
5. Capacità di Lavorare con Dati di Alta Dimensione: Gestisce bene datasets con molte variabili, selezionando in modo 
   casuale le caratteristiche da usare per ciascun albero.

### Limitazioni

1. Modello Pesante: Un Random Forest è un modello "pesante", cioè richiede più risorse computazionali rispetto ad altri modelli, 
   perché deve costruire e mantenere molti alberi. 
2. Interpretabilità Limitata: Sebbene gli alberi singoli siano facilmente interpretabili, l'aggregazione di molti alberi 
   rende difficile capire come il modello arriva a una determinata previsione. 
3. Tempo di Allenamento: L'addestramento di un Random Forest può essere lento se il dataset è molto grande o se la foresta 
   contiene molti alberi.

## Decision Tree

I Decision Tree (alberi decisionali) sono uno degli algoritmi di machine learning più intuitivi e ampiamente utilizzati. Si basano su una struttura ad albero, dove ogni nodo interno rappresenta una decisione basata su un attributo, ogni ramo rappresenta il risultato di quella decisione, e ogni foglia rappresenta un valore di output (classe o valore numerico). Sono utilizzati sia per problemi di classificazione che di regressione.

### Vantaggi del Decision Tree

1. Facili da interpretare:
   - La struttura ad albero è intuitiva e può essere facilmente visualizzata, rendendola accessibile anche a chi non ha un background tecnico.
   - Le decisioni sono trasparenti e possono essere spiegate in modo semplice.

2. Non richiedono preprocessing complesso:
   - I Decision Tree possono gestire sia dati numerici che categorici senza bisogno di normalizzazione o codifica one-hot.

3. Gestiscono feature non lineari:
   - Possono catturare relazioni non lineari tra le feature e il target.

4. Robusti ai dati mancanti:
   - Possono gestire valori mancanti nei dati, sia durante l'addestramento che durante la predizione.

5. Veloci da addestrare:
   - Per dataset di piccole o medie dimensioni, l'addestramento è generalmente rapido.

### Limitazioni del Decision Tree

1. Soggetti a overfitting:
   - Senza un'adeguata regolarizzazione (es., potatura), i Decision Tree tendono a creare alberi troppo complessi che si adattano eccessivamente ai dati di training.

2. Instabilità:
   - Piccoli cambiamenti nei dati possono portare a strutture dell'albero completamente diverse.

3. Bias verso feature con molti valori:
   - Tendono a favorire feature con un numero elevato di valori (es., feature categoriche con molte categorie).

4. Non sempre ottimali per dataset molto grandi:
   - Per dataset di grandi dimensioni, altri algoritmi come le Random Forest o il Gradient Boosting possono essere più efficaci.

5. Limitati nelle relazioni complesse:
   - Possono avere difficoltà a catturare relazioni complesse tra feature, specialmente se non sono gerarchiche.

### Contesto di utilizzo per un'azienda di piccole dimensioni: una pizzeria

Una piccola pizzeria vuole ottimizzare le proprie operazioni e migliorare la soddisfazione dei clienti. Ha dati storici su:

- Ordinazioni (es., tipo di pizza, orario, giorno della settimana).
- Clienti (es., età, frequenza di visite).
- Feedback (es., valutazioni, commenti).

Applicazione dei Decision Tree
1. Previsione della domanda:
   - Un Decision Tree può essere utilizzato per prevedere il numero di pizze da preparare in base a giorno della settimana, orario e condizioni meteorologiche.
   - Esempio: Se è venerdì sera e piove, è probabile che ci siano più ordinazioni di pizze a domicilio.

2. Segmentazione dei clienti:

   - Classificare i clienti in base alla loro probabilità di ritorno (es., "fedele" vs "occasionale") in base a età, frequenza di visite e tipologia di ordinazioni.

3. Ottimizzazione del menu:
   - Identificare quali pizze sono più popolari in base a stagionalità, orario e preferenze dei clienti.

I Decision Tree sono uno strumento versatile e potente, adatto sia per piccole aziende come una pizzeria che per aziende di medie dimensioni come un'azienda tessile. Per la pizzeria, offrono un modo semplice ed economico per ottimizzare le operazioni e migliorare la soddisfazione dei clienti. Per l'azienda tessile, possono aiutare a identificare inefficienze e migliorare la qualità del prodotto. Tuttavia, è importante essere consapevoli dei loro limiti, come il rischio di overfitting, e considerare l'uso di tecniche più avanzate (es., Random Forest) per problemi più complessi.
