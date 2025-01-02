package com.aijava.randomforest;

import weka.classifiers.trees.RandomForest;
import weka.classifiers.Evaluation;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.util.Random;

public class RandomForestExample {
    public static void main(String[] args) {
        try {
            // Carica il dataset Iris (modifica il percorso del file secondo necessità)
            ConverterUtils.DataSource source = new ConverterUtils.DataSource("path_to_iris.arff");
            Instances data = source.getDataSet();

            // Imposta l'attributo di classe (l'ultima colonna del dataset)
            if (data.classIndex() == -1) {
                data.setClassIndex(data.numAttributes() - 1);
            }

            // Crea un classificatore Random Forest
            RandomForest rf = new RandomForest();
            rf.setNumIterations(100); // Numero di alberi nella foresta
            rf.setMaxDepth(10);  // Profondità massima degli alberi

            // Addestra il modello sul dataset
            rf.buildClassifier(data);
            System.out.println("Modello Random Forest addestrato con successo!");

            // Valutazione del modello
            Evaluation eval = new Evaluation(data);
            eval.crossValidateModel(rf, data, 10, new Random(1)); // Cross-validation a 10 fold

            // Stampa i risultati
            System.out.println("Summary del modello:");
            System.out.println(eval.toSummaryString());
            System.out.println("Precisione: " + eval.pctCorrect() + "%");
            System.out.println("\nClassificazione per classe:");
            System.out.println(eval.toClassDetailsString());
            System.out.println("\nMatrice di confusione:");
            System.out.println(eval.toMatrixString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
