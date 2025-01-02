package com.aijava.decisiontree;

import java.util.ArrayList;
import java.util.List;

import weka.classifiers.trees.J48;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

public class ComplexObjectDecisionTree {
    public static void main(String[] args) throws Exception {
        // Creare il dataset
        Instances dataset = createDataset();

        // Configurare l'albero decisionale J48
        J48 tree = new J48();
        tree.setOptions(new String[]{"-U"}); // Usa l'albero non potato

        // Addestrare il modello
        tree.buildClassifier(dataset);

        // Stampare l'albero decisionale
        System.out.println(tree);

        // Creare un'istanza di test e classificarla
        Persona testPersona = new Persona("Mario", 35, "Maschio", 45000.0, true);
        Instance testInstance = createInstanceFromPersona(testPersona, dataset);
        double prediction = tree.classifyInstance(testInstance);

        // Stampare la predizione
        System.out.println("Predicted class: " + dataset.classAttribute().value((int) prediction));
    }

    private static Instances createDataset() {
        // Definire gli attributi
        Attribute nome = new Attribute("nome", (List<String>) null); // Attributo stringa
        Attribute eta = new Attribute("eta"); // Attributo numerico
        Attribute sesso = new Attribute("sesso", java.util.Arrays.asList("Maschio", "Femmina")); // Attributo nominale
        Attribute reddito = new Attribute("reddito"); // Attributo numerico
        Attribute haFigli = new Attribute("haFigli", java.util.Arrays.asList("true", "false")); // Attributo nominale
        Attribute classe = new Attribute("classe", java.util.Arrays.asList("Si", "No")); // Attributo target

        // Creare la lista di attributi
        ArrayList<Attribute> attributes = new ArrayList<>();
        attributes.add(nome);
        attributes.add(eta);
        attributes.add(sesso);
        attributes.add(reddito);
        attributes.add(haFigli);
        attributes.add(classe);

        // Creare il dataset
        Instances dataset = new Instances("PersonaDataset", attributes, 0);
        dataset.setClassIndex(dataset.numAttributes() - 1);

        // Aggiungere le istanze
        addPersonaToDataset(dataset, new Persona("Alice", 25, "Femmina", 30000.0, false), "Si");
        addPersonaToDataset(dataset, new Persona("Bob", 45, "Maschio", 60000.0, true), "No");
        addPersonaToDataset(dataset, new Persona("Charlie", 35, "Maschio", 50000.0, true), "Si");
        addPersonaToDataset(dataset, new Persona("Diana", 30, "Femmina", 40000.0, false), "No");

        return dataset;
    }

    private static void addPersonaToDataset(Instances dataset, Persona persona, String classe) {
        Instance instance = new DenseInstance(dataset.numAttributes());
        instance.setValue(dataset.attribute("nome"), persona.getNome());
        instance.setValue(dataset.attribute("eta"), persona.getEta());
        instance.setValue(dataset.attribute("sesso"), persona.getSesso());
        instance.setValue(dataset.attribute("reddito"), persona.getReddito());
        instance.setValue(dataset.attribute("haFigli"), persona.isHaFigli() ? "true" : "false");
        instance.setValue(dataset.attribute("classe"), classe);
        dataset.add(instance);
    }

    private static Instance createInstanceFromPersona(Persona persona, Instances dataset) {
        Instance instance = new DenseInstance(dataset.numAttributes());
        instance.setDataset(dataset);
        instance.setValue(dataset.attribute("nome"), persona.getNome());
        instance.setValue(dataset.attribute("eta"), persona.getEta());
        instance.setValue(dataset.attribute("sesso"), persona.getSesso());
        instance.setValue(dataset.attribute("reddito"), persona.getReddito());
        instance.setValue(dataset.attribute("haFigli"), persona.isHaFigli() ? "true" : "false");
        return instance;
    }
}
