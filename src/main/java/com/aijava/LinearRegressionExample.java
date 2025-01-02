package com.aijava;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class LinearRegressionExample {
    public static void main(String[] args) {
        /*SimpleRegression regression = new SimpleRegression();

        // Add data points
        regression.addData(1, 2);
        regression.addData(2, 4);
        regression.addData(3, 6);
        regression.addData(4, 8);

        // Get slope and intercept
        double slope = regression.getSlope();
        double intercept = regression.getIntercept();

        // Make a prediction
        double predictedValue = regression.predict(5);
        System.out.println("Predicted value for 5: " + predictedValue);*/

        // Regressione per la temperatura
        SimpleRegression temperatureRegression = new SimpleRegression();
        temperatureRegression.addData(20, 50); // Temperatura 20°C, 50 pizze vendute
        temperatureRegression.addData(25, 60);
        temperatureRegression.addData(30, 70);
        temperatureRegression.addData(35, 80);

        // Regressione per la promozione
        SimpleRegression promotionRegression = new SimpleRegression();
        promotionRegression.addData(0, 50); // Nessuna promozione, 50 pizze vendute
        promotionRegression.addData(1, 70); // Promozione attiva, 70 pizze vendute

        // Valori previsti
        double predictedFromTemperature = temperatureRegression.predict(28); // Temperatura prevista: 28°C
        double predictedFromPromotion = promotionRegression.predict(1); // Promozione attiva

        // Combinare le previsioni (media semplice)
        double finalPrediction = (predictedFromTemperature + predictedFromPromotion) / 2;

        System.out.println("Previsione vendite per sabato: " + finalPrediction + " pizze");
    }
}
