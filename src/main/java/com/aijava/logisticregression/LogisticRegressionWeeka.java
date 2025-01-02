package com.aijava.logisticregression;

import weka.classifiers.Classifier;
import weka.classifiers.functions.Logistic;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class LogisticRegressionWeeka {
    public static void main(String[] args) {
        try {
            // Caricare il dataset
            String filePath = "promotions.csv"; // Path del dataset
            ConverterUtils.DataSource source = new ConverterUtils.DataSource(filePath);
            Instances data = source.getDataSet();

            // Impostare la classe (ultima colonna)
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);

            // Creare il modello di Logistic Regression
            Classifier logistic = new Logistic();
            logistic.buildClassifier(data);
            System.out.println("Modello di Logistic Regression costruito con successo!");

            // Usare il modello per fare previsioni su nuove istanze
            Instances newData = source.getDataSet(); // Dati nuovi
            newData.setClassIndex(newData.numAttributes() - 1);
            double prediction = logistic.classifyInstance(newData.instance(0)); // Prima istanza
            System.out.println("Predizione: " + newData.classAttribute().value((int) prediction));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
