package com.aijava.decisiontree;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.classifiers.trees.J48;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaDecisionTreeExample {
    public static void main(String[] args) throws Exception {
        // Creare un dataset di esempio
        Instances dataset = createDataset();

        // Configurare l'albero decisionale J48
        J48 tree = new J48();
        tree.setOptions(new String[]{"-U"}); // Usa l'albero non potato

        // Addestrare il modello
        tree.buildClassifier(dataset);

        // Stampare l'albero decisionale
        System.out.println(tree);

        // Creare un'istanza di test e classificarla
        Instance testInstance = createTestInstance(dataset);
        double prediction = tree.classifyInstance(testInstance);

        // Stampare la predizione
        System.out.println("Predicted class: " + dataset.classAttribute().value((int) prediction));
    }

    private static Instances createDataset() {
        // Definire gli attributi
        Attribute outlook = new Attribute("outlook", java.util.Arrays.asList("sunny", "overcast", "rainy"));
        Attribute temperature = new Attribute("temperature", java.util.Arrays.asList("hot", "mild", "cool"));
        Attribute humidity = new Attribute("humidity", java.util.Arrays.asList("high", "normal"));
        Attribute windy = new Attribute("windy", java.util.Arrays.asList("true", "false"));
        Attribute play = new Attribute("play", java.util.Arrays.asList("yes", "no"));

        // Creare la lista di attributi
        java.util.ArrayList<Attribute> attributes = new java.util.ArrayList<>();
        attributes.add(outlook);
        attributes.add(temperature);
        attributes.add(humidity);
        attributes.add(windy);
        attributes.add(play);

        // Creare il dataset
        Instances dataset = new Instances("Weather", attributes, 0);
        dataset.setClassIndex(dataset.numAttributes() - 1);

        // Aggiungere le istanze
        addInstance(dataset, "sunny", "hot", "high", "false", "no");
        addInstance(dataset, "sunny", "hot", "high", "true", "no");
        addInstance(dataset, "overcast", "hot", "high", "false", "yes");
        addInstance(dataset, "rainy", "mild", "high", "false", "yes");
        addInstance(dataset, "rainy", "cool", "normal", "false", "yes");
        addInstance(dataset, "rainy", "cool", "normal", "true", "no");
        addInstance(dataset, "overcast", "cool", "normal", "true", "yes");
        addInstance(dataset, "sunny", "mild", "high", "false", "no");
        addInstance(dataset, "sunny", "cool", "normal", "false", "yes");
        addInstance(dataset, "rainy", "mild", "normal", "false", "yes");
        addInstance(dataset, "sunny", "mild", "normal", "true", "yes");
        addInstance(dataset, "overcast", "mild", "high", "true", "yes");
        addInstance(dataset, "overcast", "hot", "normal", "false", "yes");
        addInstance(dataset, "rainy", "mild", "high", "true", "no");

        return dataset;
    }

    private static void addInstance(Instances dataset, String outlook, String temperature, String humidity, String windy, String play) {
        Instance instance = new DenseInstance(5);
        instance.setValue(dataset.attribute(0), outlook);
        instance.setValue(dataset.attribute(1), temperature);
        instance.setValue(dataset.attribute(2), humidity);
        instance.setValue(dataset.attribute(3), windy);
        instance.setValue(dataset.attribute(4), play);
        dataset.add(instance);
    }

    private static Instance createTestInstance(Instances dataset) {
        Instance instance = new DenseInstance(5);
        instance.setDataset(dataset);
        instance.setValue(dataset.attribute(0), "sunny");
        instance.setValue(dataset.attribute(1), "cool");
        instance.setValue(dataset.attribute(2), "high");
        instance.setValue(dataset.attribute(3), "true");
        return instance;
    }
    
}
