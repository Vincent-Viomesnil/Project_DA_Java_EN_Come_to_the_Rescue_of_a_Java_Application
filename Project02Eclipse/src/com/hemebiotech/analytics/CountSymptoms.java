package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptoms {

/**
 * 
 * @param symptomsList to have the set of the symptoms' list
 * @return countSymptoms = returns the list of symptoms and display the number of occurrences
 */
	public TreeMap<String, Integer> nbOccurrence(List<String> symptomsList) {

		TreeMap<String, Integer> countSymptoms = new TreeMap<String, Integer>();

		for(String symptom : symptomsList) {	// Display of each symptom contained in the symptoms' list
			if (countSymptoms.containsKey(symptom)) {	// Checking if the symptom is existing in the map 
																  
				countSymptoms.put(symptom, countSymptoms.get(symptom)+1); // if symptom is existing, then it will be increment by 1
				
			} else {
				countSymptoms.put(symptom, 1); //if symptom doesn't exist, we put it the value of 1 
			}
		}
		return countSymptoms; 
	
	}
}