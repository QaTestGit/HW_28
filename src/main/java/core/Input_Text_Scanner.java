package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input_Text_Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/vitalii/input.txt");
		Scanner s = new Scanner(file);
		while(s.hasNext()){
			String first_name = s.next();
			String last_name = s.next();
			System.out.println("Full name is: "+first_name+" "+last_name);
		}
		s.close();
		

	}

}
