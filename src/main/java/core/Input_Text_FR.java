package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input_Text_FR {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/vitalii/input.txt");
		BufferedReader br = new BufferedReader(new FileReader (file));
		while(br.ready()){
			String first_name = br.readLine();
			String last_name = br.readLine();
			System.out.println("Full name is: "+ first_name+" "+last_name);
		}
		br.close();

	}

}
