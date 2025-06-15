/**
 * 
 */
package calcoli;

import java.util.Scanner;

/**
 * 
 */
public class Calcoli {
	
	public static boolean ePariIf (int numero) {
		if((numero % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean ePariTernario(int numero) {
		boolean risultato = ((numero % 2) == 0) ? true : false ;
		return risultato;
	}
	
	public static int esaToDeciSwitch (char valore) {
		switch (valore) {
	case '1': return 1 ;	
	case '2': return 2 ;	
	case '3': return 3 ;	
	case '4': return 4 ;	
	case '5': return 5 ;	
	case '6': return 6 ;	
	case '7': return 7 ;	
	case '8': return 8 ;
	case '9': return 9 ;
	case 'a':case 'A': return 10;
	case 'b':case 'B': return 11;
	case 'c':case 'C': return 12;
	case 'd':case 'D': return 13;
	case 'e':case 'E': return 14;
	case 'f':case 'F': return 15;
	default: return 0;
		}
		}
	
	
	public static int greaterCommonDivisor(int numero1,int numero2) {
		int num1Tmp;
		int num2Tmp;
		int reminder = -1;
		
		if(numero1 > numero2) {
			num1Tmp = numero1;
			num2Tmp = numero2;
		}
		else {
			num1Tmp = numero2;
			num2Tmp = numero1;
		}
		
		while(reminder != 0) {
			reminder = (num1Tmp % num2Tmp);
			num1Tmp = num2Tmp;
			num2Tmp = reminder;
		}
		
		return num1Tmp;
	}
	
	public static int readIntPositive() {
		int numero = 0;
		try (Scanner scanner = new Scanner(System.in);){
			
			System.out.println("Inserisci un numero intero positivo...");
			
			do {
				numero = scanner.nextInt();
				if(numero <= 0) {
					System.out.println("Ti avevo chiesto un numero intero positivo. \nreinseriscilo");
				}
			} while (numero <= 0);
			
		} catch (Exception e) {
			
			System.err.println(e);
		}
		return numero;
	}
	
	public static int factInt (int numero) {
		int risultato = numero;
		
		for (int a = 1; a < numero; a++) {
			risultato = (risultato *(numero - a));
		}
		
		return risultato;
		
	}
}
