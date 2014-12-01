package lab15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFieldWrite {

		public static void main(String[] args) {
			FileWriter fw;
			try
				{
					fw = new FileWriter(new File("test.txt"));
					fw.append("Evo jedan red");
					fw.append("\n");
					fw.flush();
					fw.append("Evo drugi red");
					fw.append("\n");
					fw.append("Evo treći red");
					fw.close();
				} catch (IOException e){
					e.printStackTrace();
				}
		}

	}

