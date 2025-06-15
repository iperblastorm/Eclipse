/**
 * 
 */
import java.util.Random;

import calcoli.*;
import liste.Lista;
import polimorf1.Circolo;
import polimorf2.Negozio;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Il numero 2 è pari?"+" "+Calcoli.ePariIf(2));
		System.out.println("Il numero 3 è pari?"+" "+Calcoli.ePariIf(3));
		System.out.println("Operatore ternario");
		System.out.println("Il numero 2 è pari?"+" "+Calcoli.ePariTernario(2));
		System.out.println("Il numero 3 è pari?"+" "+Calcoli.ePariTernario(3));
		System.out.println("Esadecimale");
		System.out.println(Calcoli.esaToDeciSwitch('t'));
		System.out.println(Calcoli.esaToDeciSwitch('a'));
		System.out.println(Calcoli.esaToDeciSwitch('A'));
		System.out.println("Massimo comun divisore switch");
		System.out.println(Calcoli.greaterCommonDivisor(12,18));
		System.out.println("Leggi numero positivo:");
		System.out.println(Calcoli.readIntPositive());
		System.out.println("fattoriale");
		System.out.println(Calcoli.factInt(5));
		
		System.out.println("Array");
		Vector array = new Vector(50, 30);
		System.out.println("L'array comincia qui;");
		array.printArray();
		System.out.println("Il numero di elementi uguali a 4 è"+" "+array.ifEquals(4));
		System.out.println("La media degli elementi maggiori di 4 è"+" "+array.mediaIfMoreThan(4));
		System.out.println("La prima posizione del numero 4 è"+" "+array.IndexIfEquals(4));
		System.out.println("Maggiore degli elementi minori di 4 è"+" "+array.maxIfLessThan(4));
		array.inverseArray();
		System.out.println("L'array comincia qui;");
		array.printArray();
		*/
		
		/*
		System.out.println("Esercizi liste");
		Lista lista = new Lista(10);
		lista.listVisualWhile();
		System.out.println();
		lista.listVisualFor();
		System.out.println();
		lista.listVisualRicorsive();
		System.out.println();
		System.out.println("Il conto degli elementi della lista è "+ lista.countListWhile());
		System.out.println("Il conto degli elementi della lista è "+ lista.countListFor());
		System.out.println("Il conto degli elementi della lista è "+ lista.countListRico());
		System.out.println();
		System.out.println("Il conto della lunghezza delle stringhe maggiori di 4 è "+ lista.sumWidthWhile(4));
		System.out.println("Il conto della lunghezza delle stringhe maggiori di 4 è "+ lista.sumWidthFor(4));
		System.out.println("Il conto della lunghezza delle stringhe maggiori di 4 è "+ lista.sumWidthRico(4));
		System.out.println();
		System.out.println("Media delle lunghezze se pari");
		System.out.println("La media della lunghezza delle stringhe pari è "+ lista.meanLenghtEvenWhile());
		System.out.println("La media della lunghezza delle stringhe pari è "+ lista.meanLenghtEvenFor());
		System.out.println();
		System.out.println("La somma della lunghezza delle stringhe pari è "+ lista.sumLenghtEvenRic());
		System.out.println();
		System.out.println("controllo stringa contenuta \n");
		lista.containStringWhile("ca");
		System.out.println();
		lista.containStringFor("ca");
		System.out.println();
		lista.containStringRic("ca");
		System.out.println();
		System.out.println("Numero stringhe stessa lunghezza");
		System.out.println(lista.ifEqualsWhile("ciao"));
		System.out.println(lista.ifEqualsFor("ciao"));
		System.out.println(lista.ifEqualsRic("ciao"));
		System.out.println();
		System.out.println("Stringa piu lunga");
		System.out.println(lista.maxLenghtWhile());
		System.out.println(lista.maxLenghtFor());
		System.out.println(lista.maxLenghtRic());
		*/
		
		Random random = new Random();
		//Circolo prova1 = new Circolo(20, 30);
		
		//System.out.println(prova1.mediaCircolo(2));
		
		Negozio negozio = new Negozio(10, 20);
		
		negozio.isZincata(12);
		
		
	}
}
