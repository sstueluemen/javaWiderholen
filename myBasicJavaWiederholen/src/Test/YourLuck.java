package Test;

import java.util.Scanner;

public class YourLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner Class bekommt ein input vom Benutzer
		Scanner leser = new Scanner(System.in);
		System.out.println("Isminiz nedir?");
		String name = leser.next(); //next fonction return ein String
		System.out.println("Hello, " + name);
		
		System.out.println("Wie alt bist du?");
		int alt = leser.nextInt(); //nextInt fonction return ein Int
		
		
		int buchstabenZahl = name.length();
		
		int luckyNummer = 0;
		
		if(alt<15) {
			luckyNummer = (buchstabenZahl *  alt) %10;
		} else if (alt<20){
			luckyNummer = (alt * alt- buchstabenZahl)%10;
		} else if (alt<40){
			luckyNummer = (buchstabenZahl - alt)%10;
		} else if (alt<60) {
			luckyNummer = (buchstabenZahl * 5 - alt)%10;
		}
		//Wann du hast nur eine Bedingung, brauchst du nicht GeschweifteKlammen {}
		if(luckyNummer < 0)
			luckyNummer = luckyNummer * (-1);
		
		System.out.println("Deine LuckyNummer ist: " + luckyNummer);
	}
	}
