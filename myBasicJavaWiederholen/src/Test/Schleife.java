package Test;

public class Schleife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i=0; i<=10; i++)
			System.out.println(i);
		int zahl = 5;
		while(zahl<=15) {
			System.out.println(zahl);
			zahl = zahl + 5;
		}
		
		
		//do-while muss mindestens einmal durchlaufen
		int variable = 35;
		do {
			System.out.println(variable);
		}while(variable == 40);
		
		//ineinander fors
		
		for( int j=0; j<5; j++) {
			for (int k=5; k>j; k--) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		for( int j=5; j>0; j--) {
			for (int k=0; k<j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for( int j=5; j>=0; j--) {
			for (int k=5; k>j; k--) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}

