package calcoli;

import java.util.Random;

public class Vector {
	Random randon = new Random();
	int array[];

	public Vector(int n, int m) {
		array = new int[n];
		for (int a = 0; a < n; a++) {
			array[a] = randon.nextInt(m + 1);
		}
	}

	public void printArray() {
		for (int elemento : array) {
			System.out.println(elemento);
		}
	}

	public int ifEquals(int numero) {
		int contatore = 0;

		for (int elemento : array) {

			if (elemento == numero) {
				contatore++;
			}
		}
		return contatore;
	}

	public float mediaIfMoreThan(int numero) {
		int contatore = 0;
		float somma = 0;
		float risultato = 0;

		for (int elemento : array) {
			if (elemento > numero) {
				somma += elemento;
				contatore++;
			}
		}

		if (contatore > 0) {
			risultato = somma / contatore;
		}
		return risultato;
	}

	public int IndexIfEquals(int numero) {
		int index = -1;

		for (int elemento = 0; elemento < array.length; elemento++) {
			if (array[elemento] == numero) {
				index = (elemento);
				break;
			}
		}
		return index;
	}

	public int maxIfLessThan(int numero) {
		int risultato = Integer.MIN_VALUE;

		for (int elemento : array) {
			if (elemento < numero) {
				if (elemento > risultato) {
					risultato = elemento;
				}
			}
		}
		return risultato;
	}
	
	public void inverseArray() {
		int dimensione = this.array.length;
		int array2[];
		array2 = new int [dimensione];
		
		for(int elemento = 0; elemento < dimensione; elemento ++) {
			array2[(dimensione - 1) -elemento] = this.array[elemento];
		}
		for(int elemento = 0; elemento < dimensione; elemento ++) {
			array[elemento]= array2[elemento];
		}
	}

}
