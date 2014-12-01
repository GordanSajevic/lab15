package lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileReader {

	public static void main(String[] args) {
		try {
			Scanner fin = new Scanner(new File("src/lab15/TestFieldWrite.java"));
			while(fin.hasNext()){
				System.out.println(fin.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
