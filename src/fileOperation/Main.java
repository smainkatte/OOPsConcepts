package fileOperation;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("src/message.txt");
		
		System.out.println(digitsOnlyFileReader.readFile());
		System.out.println(digitsOnlyFileReader.getPath());
		
		ToUpperCaseFileReader toUpperCaseFileReader = new ToUpperCaseFileReader("src/message.txt");
		System.out.println(toUpperCaseFileReader.readFile());
		System.out.println(toUpperCaseFileReader.getPath());
	}

}
