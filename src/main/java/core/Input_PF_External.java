package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Input_PF_External {

	public static void main(String[] args) throws IOException  {
		String file = "/Users/vitalii/input.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(file));
		String first_name = p.getProperty("f_name");
		String last_name = p.getProperty("l_name");
		String myAge = p.getProperty("age");
		System.out.println("Full name is: "+first_name+" "+last_name+"\n"+"Age "+myAge+" years old." );
		p.clear();

	}

}
