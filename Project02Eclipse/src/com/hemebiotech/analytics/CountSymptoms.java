package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptoms {

/**
* @param symptomsList to have the set of the symptoms' list
* @return countSymptoms = returns the list of symptoms and display the number
*         of occurrences
*/
	public TreeMap<String, Integer> nbOccurrence(List<String> symptomsList) {

		TreeMap<String, Integer> countSymptoms = new TreeMap<String, Integer>();

		for (String symptom : symptomsList) {
			if (countSymptoms.containsKey(symptom)) {

				countSymptoms.put(symptom, countSymptoms.get(symptom) + 1);

			} else {
				countSymptoms.put(symptom, 1);
			}
		}
		return countSymptoms;

	}
}