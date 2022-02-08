package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * @author Vincent Viomesnil
 */

public class AnalyticsCounter {

	static final String inputFile = ".\\Project02Eclipse\\symptoms.txt";
	static final String outputFile = ".\\Project02Eclipse\\result.out";
	static TreeMap<String, Integer> mapOccurrence = new TreeMap<String, Integer>();

	/**
	 * @param args an array of command-line arguments for the application.
	 * @throws Exception with the reading or writing of Input/Output Stream
	 */
	public static void main(String[] args) throws Exception {

		ISymptomReader reader = new ReadSymptomDataFromFile(inputFile);
		List<String> symptomsList = reader.getSymptoms();
		
		CountSymptoms countSymptoms = new CountSymptoms();
		mapOccurrence = countSymptoms.nbOccurrence(symptomsList);
		
		ISymptomWriter writer = new WriteSymptomOnFile(outputFile);
		writer.writeSymptoms(mapOccurrence);
	}
}