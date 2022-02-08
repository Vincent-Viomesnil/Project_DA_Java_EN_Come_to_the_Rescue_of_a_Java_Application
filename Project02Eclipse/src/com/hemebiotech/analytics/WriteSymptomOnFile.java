package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteSymptomOnFile implements ISymptomWriter {

	private String outputFile;

	public WriteSymptomOnFile(String outputFile) throws IOException {
		this.outputFile = outputFile;
	}

	@Override
	public void writeSymptoms(TreeMap<String, Integer> nbOccurrence) throws IOException {

		try (FileWriter fileWriter = new FileWriter(outputFile, false);
				BufferedWriter writer = new BufferedWriter(fileWriter)) {
			for (Entry<String, Integer> entry : nbOccurrence.entrySet()) {
				writer.write(entry.getKey() + " = " + entry.getValue());
				writer.newLine();
			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
