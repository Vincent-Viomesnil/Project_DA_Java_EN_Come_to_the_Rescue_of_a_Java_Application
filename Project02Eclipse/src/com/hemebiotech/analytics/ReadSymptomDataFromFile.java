package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** 
* @param filepath a full or partial path to file with symptom strings in it,
* 
*/

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String inputFile;


	public ReadSymptomDataFromFile(String inputFile) throws IOException {
		this.inputFile = inputFile;
	}

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (inputFile != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				String line = reader.readLine();

				while (line != null) {
					result.add(line); // display the line
					line = reader.readLine(); // reading the next line
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
