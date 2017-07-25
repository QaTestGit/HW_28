package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Input_CSV {

	public static void main(String[] args) throws IOException {
		String csvFile = "/Users/vitalii/input.csv";
		BufferedReader br = new BufferedReader(new FileReader (csvFile));
		while(br.ready()){
			String line = br.readLine();
			String [] csv = line.split(",");
			String first_name = csv[0];
			String last_name = csv[1];
			String myAge = csv[2];
			System.out.println("Full nbame is: "+first_name+" "+last_name+". Age - "+myAge+" years old.");
		}

	}

}
