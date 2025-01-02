package com.aijava;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.util.Random;

public class ClassificatoreExample {
    public static void main(String[] args) {
        try {
            // Carica il dataset
            String filePath = "dataset.csv"; // Modifica con il tuo file
            ConverterUtils.DataSource source = new ConverterUtils.DataSource(filePath);
            Instances data = source.getDataSet();

            // Imposta l'indice della classe (ultima colonna)
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);

            // Crea il classificatore
            Classifier classifier = new J48();
            classifier.buildClassifier(data);
            System.out.println("Modello costruito con successo!");

            // Usa il modello per classificare nuove istanze
            Instances newData = source.getDataSet(); // Modifica con i nuovi dati
            newData.setClassIndex(newData.numAttributes() - 1);
            double prediction = classifier.classifyInstance(newData.instance(0)); // Prima istanza
            System.out.println("Predizione: " + data.classAttribute().value((int) prediction));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
