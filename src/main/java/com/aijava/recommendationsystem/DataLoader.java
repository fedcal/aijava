package com.aijava.recommendationsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class DataLoader {
    public Map<Integer, Map<Integer, Double>> loadRatings(String filePath) throws Exception {
           Map<Integer, Map<Integer, Double>> userRatings = new HashMap<>();
           try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
               String line;
               while ((line = br.readLine()) != null) {
                   String[] parts = line.split("::"); // assuming user::item::rating
                   int userId = Integer.parseInt(parts[0]);
                   int itemId = Integer.parseInt(parts[1]);
                   double rating = Double.parseDouble(parts[2]);
                   userRatings.computeIfAbsent(userId, k -> new HashMap<>()).put(itemId, rating);
               }
           }
           return userRatings;
       }
}
