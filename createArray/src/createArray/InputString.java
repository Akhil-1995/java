package createArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {

	public static String getString() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;

	}
	
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);		
	}
	
	public static int getDouble() throws IOException {
		String s = getString();
		Double aDub = Double.valueOf(s);
		return (int) aDub.doubleValue();		
	}

}
