package com.aijava.logisticregression;

public class DataPoint {
    private double[] features;
    private int label;

    public DataPoint(double[] features, int label) {
        this.features = features;
        this.label = label;
    }

    public double[] getFeatures() {
        return features;
    }

    public int getLabel() {
        return label;
    }
}
