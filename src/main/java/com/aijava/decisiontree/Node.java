package com.aijava.decisiontree;

public class Node {
    String feature;
    Node left;
    Node right;
    String label;

    public Node(String feature) {
        this.feature = feature;
    }

    public Node(String feature, String label) {
        this.feature = feature;
        this.label = label;
    }
}
