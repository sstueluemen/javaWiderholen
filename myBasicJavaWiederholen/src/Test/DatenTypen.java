package Test;

public class DatenTypen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text= "Wiederholung von Datentypen";
		String meinName="Selim";

		
		System.out.print(text);
		System.out.print(" ");
		System.out.println(meinName);
		
		
		
		//Mit Konkotanation
		System.out.println(text + " " +meinName);
		
		//Variablen
		char firstBuchstabe = 'S';
		int alte=47;
		
		System.out.println("First Burchtaben meine Name ist : " + firstBuchstabe);
		//String + int
		System.out.println("Meine Alte ist : " + alte);
		//int+int
		System.out.println(alte+alte);
		
		double kilo= 80.9;
		
		
		//int + double = alle umwandeln to double
		System.out.println(alte + kilo);
		
		//erste Variable, dann einen Wert zuweisen 
		String PLZ;
		PLZ = "01516";
		System.out.println(PLZ);
		
		// Variable muss mit ein Burchtaben anfangen. 
		// Variable cemalCase muss i.d.R. sein. PascalCase und snakecase passt nicht i.d.R

	}

}
