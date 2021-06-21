package Practical_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class CheckFile {

	public static void main(String[] args) {
		doesFileExist(".\\config.properties");

	}

	private static void doesFileExist(String string) {
		try {
			File myObj = new File(".\\config.properties"); 
			Scanner myReader = new Scanner(myObj); 
			while (myReader.hasNextLine()) { 
				String data = myReader.nextLine();  
				String[] tokens = data.split("-|,");  
				Arrays.parallelSetAll(tokens, (i) -> tokens[i].trim()); 
				Arrays.stream(tokens).forEach(result -> System.out.println(result + "\n")); 
																							
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("No files at path or an error occurred."); 
		}
	}

}