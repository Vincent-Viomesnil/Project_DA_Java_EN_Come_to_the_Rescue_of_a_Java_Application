package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;
/**
 *
 *  @return a raw listing of all Symptoms obtained from a data source, duplicates
 *    are possible/probable
 */

public interface ISymptomWriter {
		
		public void writeSymptoms (TreeMap<String, Integer> nbOccurrence) throws IOException;

	}