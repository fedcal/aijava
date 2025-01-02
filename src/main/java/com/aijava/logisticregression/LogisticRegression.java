package com.aijava.logisticregression;

import java.util.List;

public class LogisticRegression {
    private double[] weights;
    private double learningRate;
    private int epochs;

    public LogisticRegression(int featureCount, double learningRate, int epochs) {
        weights = new double[featureCount + 1]; // +1 for the bias term
        this.learningRate = learningRate;
        this.epochs = epochs;
    }

    private double sigmoid(double z) {
        return 1.0 / (1.0 + Math.exp(-z));
    }

    public void fit(List<DataPoint> data) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            for (DataPoint point : data) {
                double[] features = point.getFeatures();
                double z = weights[0]; // bias term
                for (int j = 0; j < features.length; j++) {
                    z += weights[j + 1] * features[j];
                }
                double predicted = sigmoid(z);
                double error = point.getLabel() - predicted;
                weights[0] += learningRate * error; // update bias term
                for (int j = 0; j < features.length; j++) {
                    weights[j + 1] += learningRate * error * features[j]; // update weights
                }
            }
        }
    }

    public int predict(double[] features) {
        double z = weights[0];
        for (int j = 0; j < features.length; j++) {
            z += weights[j + 1] * features[j];
        }
        return sigmoid(z) >= 0.5 ? 1 : 0; // classify as 1 if the probability is >= 0.5

    }
    public double evaluate(List<DataPoint> testData) {
        int correctPredictions = 0;
        for (DataPoint point : testData) {
            double[] features = point.getFeatures();
            int predicted = predict(features);
            if (predicted == point.getLabel()) {
                correctPredictions++;
            }
        }
        return (double) correctPredictions / testData.size();
    }

    public static void main(String[] args) {
        List<DataPoint> data = DatasetLoader.loadData();
        LogisticRegression model = new LogisticRegression(2, 0.01, 1000);
        model.fit(data);

        // Making predictions
        double[] testPoint = {2.5, 5.0}; // Example input
        int predictedLabel = model.predict(testPoint);
        System.out.println("Predicted Label: " + predictedLabel);
        double accuracy = model.evaluate(data);
        System.out.println("Model Accuracy: " + (accuracy * 100) + "%");
    }
}
