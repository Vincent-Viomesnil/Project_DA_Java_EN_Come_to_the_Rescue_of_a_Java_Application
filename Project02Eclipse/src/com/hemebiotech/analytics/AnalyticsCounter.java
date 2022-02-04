package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/** 
 * @author Vincent Viomesnil
 */

public class AnalyticsCounter {

	static final String inputFile = ".\\Project02Eclipse\\symptoms.txt";
	static final String outputFile = "result.out"; 

/**
 * 
 * @param args an array of command-line arguments for the application.
 * @throws Exception with the reading or writing of Input/Output Stream
 */
	public static void main(String[] args) throws Exception {
		
/**
 * @param mapOccurrence Creation of the symptoms list by occurrence.
 */

		ISymptomReader reader = new ReadSymptomDataFromFile(inputFile); // Read the file that contains the symptoms list. 
		List<String> symptomsList = reader.getSymptoms();  
		TreeMap<String, Integer> mapOccurrence = new TreeMap<String, Integer>(); // instantiation of the map "mapOccurrence".   	
		
		CountSymptoms countSymptoms = new CountSymptoms(); // Creation of the object "countSymptoms" of the "CountSymptoms" class
		mapOccurrence = countSymptoms.nbOccurrence(symptomsList);  // "mapOccurrence" that returns the list of symptoms and display the number of occurrences
		
		System.out.println(mapOccurrence); // Display the number of occurrences from the map 
		
		ISymptomWriter writer = new WriteSymptomOnFile(outputFile); // Write on the outputFile
		writer.writeSymptoms(mapOccurrence); // Writing the occurrence per symptom in the output file "result.out" 		
		}
}