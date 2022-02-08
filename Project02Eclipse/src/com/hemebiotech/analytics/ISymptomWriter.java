package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 *  This is the writing from a Treemap which contains the symptoms counted by occurrence. 
 * 
 * @author Vincent Viomesnil   
 */

public interface ISymptomWriter {

	/**
	 * @param nbOccurrence writing in a output file the set of symptoms by occurrence sorted in alphabetical order.
	 * @throws IOException Exception with the writing on the output file
	 */
	public void writeSymptoms(TreeMap<String, Integer> nbOccurrence) throws IOException;

}