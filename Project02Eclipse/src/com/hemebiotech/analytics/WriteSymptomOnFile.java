package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * @param writes in a output file the list of symptoms sorted in alphabetical order
 */

public class WriteSymptomOnFile implements ISymptomWriter {

	private String outputFile;
	

	public WriteSymptomOnFile(String outputFile) throws IOException {
		this.outputFile = outputFile;
	}
	
	@Override
	public void writeSymptoms (TreeMap<String, Integer> nbOccurrence) throws IOException{ //Write the result in a file, after counting and sorting from CountSymptoms class
			
		 try (FileWriter fileWriter = new FileWriter(outputFile, false);
				BufferedWriter writer = new BufferedWriter (fileWriter)) {
			 for (Entry<String, Integer> entry : nbOccurrence.entrySet()) {
					writer.write(entry.getKey()+" = "+entry.getValue());
					writer.newLine();
				}
				writer.close();

			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}


