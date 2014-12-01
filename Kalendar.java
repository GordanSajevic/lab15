package lab15;

public class Kalendar {

	public static void main(String[] args) {
		
		System.out.println(ispisiMjesec(32,1,5));
		
		}


		public static boolean godinaJePrestupna(int godina) {

		if (godina % 400 == 0) {

		return true;

		}

		if (godina % 100 == 0) {            

		return false;

		}

		if (godina % 4 == 0) {

		return true;

		}

		return false;

		}


		public static String ispisiMjesec(int brDanaUMjesecu,int prviDanUMjesecu, int prviDan, String...dani) {

		if (dani.length != 7) {

		dani = new String[] {"Pon","Uto","Sri","Cet","Pet","Sub","Ned"};

		}

		String str = "";

		int idx = prviDan - 1;

		do {

		str += String.format("%4s", dani[idx]);

		idx++;

		idx %= 7;

		} while (idx != prviDan - 1);

		str += "\n";

		int slobodnihMjesta = (prviDan - prviDanUMjesecu + 5) % 7;

		for (idx = 0; idx < slobodnihMjesta; idx++) {

		str += String.format("%4s", "");

		}

		while (idx <= brDanaUMjesecu) {

		str += String.format("%4d", (idx - slobodnihMjesta + 1));

		idx++;

		if (idx % 7 == 0) {

		str += "\n";

		}

		}

		return str;

		}

	
}
