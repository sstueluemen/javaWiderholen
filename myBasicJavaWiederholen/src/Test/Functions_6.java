package Test;

public class Functions_6 {

	public static void main(String[] args) {
		// public -> Zugriffsmodifikator oder access modifier
		// static -> Klass ebene 
		// void -> ohne Rückgabe wert geben
		// TODO Auto-generated method stub
		// zu erst arbeits main Method
		
		//Rufen Sie zu erst welche du braust...
		
		int sum1 = 8;
		int sum2 = 6;
		int returnAntwort2 = summe(sum1, sum2);
		System.out.println(returnAntwort2);
		
		//oder noch kurzer
		int returnAntwort = summe(5,6); //Hier benutzt die Methode 
		System.out.println(returnAntwort);
		
		
	}
	
	//erste Funktion oder Metod
	public static int summe(int ziffer1, int ziffer2) {
		int antwort;
		antwort = ziffer1 + ziffer2;
		return antwort;	
		}
	
	

}
