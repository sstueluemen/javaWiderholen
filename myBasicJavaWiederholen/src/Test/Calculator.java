package Test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Switch - Case
		Scanner leser = new Scanner(System.in); 
		System.out.println("Willkommen meine Rechner");
		System.out.println("Geben Sie die beiden Zahlen ein, die Sie berechnen möchten");
		double zifferEins = leser.nextInt();
		double zifferZwei = leser.nextInt();
		System.out.println("Welche Operation möchten Sie mit den Zahlen durchführen? (+, -, *, /)");
		char operation = leser.next().charAt(0);
		double ergebnis;
		switch(operation) {
		
		case '+' :
		ergebnis = zifferEins + zifferZwei;
		System.out.println(zifferEins + "+" + zifferZwei + "=" +ergebnis);
				break;
		case '-' :
		ergebnis = zifferEins - zifferZwei;
		System.out.println(zifferEins + "-" + zifferZwei + "=" +ergebnis);
				break;
		case '*':
		ergebnis = zifferEins * zifferZwei;
		System.out.println(zifferEins + "*" + zifferZwei + "=" +ergebnis);
				break;
		case '/':
		ergebnis = zifferEins / zifferZwei;
		System.out.println(zifferEins + "/" + zifferZwei + "=" +ergebnis);
				break;
				
		default : System.out.println("Bitte wählen Sie ein gültige Operation");
		
		}
		leser.close();
		
/*
		int control = 7;
		switch(control) {
		
		case 1 :System.out.println("eins");
				break;
		case 2 :System.out.println("zwei");
				break;
		case 3 :System.out.println("trei");
				break;
		case 4 :System.out.println("vier");
				break;
		case 5 :System.out.println("fünf");
				break;
		case 6 :System.out.println("sechs");
				break;
		//wenn case nicht da ist, default case lauft
		default : System.out.println("anderen");
		
		}
*/
	}

}
