package com.aijava.recommendationsystem;

import java.util.List;
import java.util.Map;

public class UserRecommendation {
    public static void main(String[] args) throws Exception {
       DataLoader dataLoader = new DataLoader();
       Map<Integer, Map<Integer, Double>> userRatings = dataLoader.loadRatings("path_to_your_dataset/ratings.dat");

       RecommendationEngine recommendationEngine = new RecommendationEngine(userRatings);
       List<Integer> userBasedRecommendations = recommendationEngine.recommendItems(1, 5);
       List<Integer> itemBasedRecommendations = recommendationEngine.recommendItemsFromItem(1, 5);

       System.out.println("User-Based Recommendations:");
       for (Integer itemId : userBasedRecommendations) {
           System.out.println(itemId);
       }

       System.out.println("Item-Based Recommendations:");
       for (Integer itemId : itemBasedRecommendations) {
           System.out.println(itemId);
       }
   }    
}
