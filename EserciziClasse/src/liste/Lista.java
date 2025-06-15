package liste;

import java.util.Random;

import elemento.Elemento;

public class Lista {
	Elemento pFirst = null;	
	Random random = new Random();
	
	public Lista(int n) {
		for (int elemento = 0; elemento < n ; elemento ++) {
			String contenuto = "ciao";
			for(int stringa = 0; stringa < (random.nextInt(10)); stringa ++ ) {
				contenuto = contenuto + "ciao";
			}
			pFirst = new Elemento(contenuto,pFirst);
		}
	}
	
	public void listVisualWhile() {
		Elemento pFirstTmp = pFirst;
		while (pFirstTmp != null) {
			System.out.println(pFirstTmp.getContenuto());
			pFirstTmp = pFirstTmp.getNext();
		}
	}
	
	public void listVisualFor() {
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null; pFirstTmp = pFirstTmp.getNext()) {
			System.out.println(pFirstTmp.getContenuto());
		}
	}
	
	private void listVisualRicorsive(Elemento pFirst) {
		if(pFirst == null) {
		}
		else {
			System.out.println(pFirst.getContenuto());
			listVisualRicorsive(pFirst.getNext());
		}
		}
	
	public void listVisualRicorsive() {
		listVisualRicorsive(this.pFirst);
	}
	
	public int countListWhile() {
		Elemento pFirstTmp = pFirst;
		int contatore = 0;
		
		while(pFirstTmp != null) {
			contatore++;
			pFirstTmp = pFirstTmp.getNext();
		}
		return contatore;
	}
	
	public int countListFor(){
		int contatore = 0;
		
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null; pFirstTmp = pFirstTmp.getNext()) {
			contatore ++;
		}
		return contatore;
	}
	
	public int countListRico() {
		return countListRico(this.pFirst);
	}
	
	private int countListRico(Elemento pFirst) {
		if(pFirst == null) {
			return 0;
		}
		else {
			return 1 + countListRico(pFirst.getNext());
		}
	}
	
	public int sumWidthWhile (int numero) {
		Elemento pFirstTmp = pFirst;
		int risultato = 0;
		
		while(pFirstTmp != null) {
			if((pFirstTmp.getContenuto().length()) > numero ) {
				risultato += (pFirstTmp.getContenuto().length());
				pFirstTmp = pFirstTmp.getNext();
			}
			else {
				pFirstTmp = pFirstTmp.getNext();
			}
		}
		return risultato;
	}
	
	
	public int sumWidthFor (int numero) {
		int risultato = 0;
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null; pFirstTmp = pFirstTmp.getNext()) {
			if((pFirstTmp.getContenuto().length()) > numero ) {
				risultato += (pFirstTmp.getContenuto().length());
				}
		}
		return risultato;
	}
	
	public int sumWidthRico(int numero) {
		return sumWidthRico(this.pFirst, numero);
	}
	
	private int sumWidthRico(Elemento pFirst, int numero) {
		if (pFirst == null) {
			return 0;
		}
		
		else if((pFirst.getContenuto().length()) <= numero) {
			return 0 + sumWidthRico(pFirst.getNext(), numero);
		}
		
		else{
			return ((pFirst.getContenuto().length()) + sumWidthRico(pFirst.getNext(), numero));
		}
	}
	
	public float meanLenghtEvenWhile() {
		Elemento pFirstTmp = pFirst;
		float sum = 0;
		int count = 0;
		while(pFirstTmp != null) {
			if(((pFirstTmp.getContenuto().length())% 2)== 0) {
				sum += (pFirstTmp.getContenuto().length());
				count ++ ;
				pFirstTmp = pFirstTmp.getNext();
			}
			else {
				pFirstTmp = pFirstTmp.getNext();
			}
		}
		if (count != 0) {
			sum = sum / count;
		}
		return sum;
	}
	
	public float meanLenghtEvenFor () {
		float sum = 0;
		int count = 0;
		
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null ; pFirstTmp = pFirstTmp.getNext()) {
			
			if(((pFirstTmp.getContenuto().length()) % 2) == 0) {
				sum += (pFirstTmp.getContenuto().length());
				count ++;
			}
		}
		sum = sum / count;
		return sum;
	}
	
	public int sumLenghtEvenRic() {
		return sumLenghtEvenRic(this.pFirst);
		}
	
	private int sumLenghtEvenRic (Elemento pFirst) {
		if(pFirst == null) {
			return 0;
		}
		else if (((pFirst.getContenuto().length()) %2 ) == 0) {
			return (pFirst.getContenuto().length()) + sumLenghtEvenRic(pFirst.getNext());
		}
		else {
			return sumLenghtEvenRic(pFirst.getNext());
		}
	}
	
	public void containStringWhile(String stringa) {
		Elemento pFirstTmp = pFirst;
		while(pFirstTmp != null) {
			if(pFirstTmp.getContenuto().contains(stringa)) {
				System.out.println("La stringa è contenuta");
				pFirstTmp = pFirstTmp.getNext();
			}
			else {
				System.out.println("La stringa non è contenuta");
				pFirstTmp= pFirstTmp.getNext();
			}
		}
	}
	
	public void containStringFor(String stringa) {
		for(Elemento pFirstTemp = pFirst; pFirstTemp != null; pFirstTemp = pFirstTemp.getNext()) {
			if(pFirstTemp.getContenuto().contains(stringa)) {
				System.out.println("La stringa è contenuta");
			}
			else {
				System.out.println("La stringa non è contenuta");
			}
		}
	}
	
	public void containStringRic (String stringa) {
		containStringRic(this.pFirst,stringa);
	}
	
	private void containStringRic (Elemento pFirst, String stringa) {
		if(pFirst == null) {
			return;
		}
		else if(pFirst.getContenuto().contains(stringa)) {
			System.out.println("La stringa è contenuta");
			containStringRic(pFirst.getNext(), stringa);
		}
		else {
			System.out.println("La stringa non è contenuta");
			containStringRic(pFirst.getNext(), stringa);
		}
	}
	
	public int ifEqualsWhile(String stringa) {
		Elemento pFirstTmp = pFirst;
		int contatore = 0;
		while(pFirstTmp != null) {
			if((pFirstTmp.getContenuto().length()) == (stringa.length())) {
				contatore ++;
				pFirstTmp = pFirstTmp.getNext();
			}
			else {
				pFirstTmp = pFirstTmp.getNext();
			}
		}
		return contatore;
	}
	
	public int ifEqualsFor (String stringa) {
		int contatore = 0;
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null; pFirstTmp = pFirstTmp.getNext()) {
			if((pFirstTmp.getContenuto().length())==(stringa.length())) {
				contatore ++;
			}
		}
		return contatore;
	}
	
	public int ifEqualsRic (String stringa) {
		return ifEqualsRic(this.pFirst,stringa);
	}
	
	private int ifEqualsRic(Elemento pFirst,String stringa) {
		if(pFirst == null) {
			return 0;
		}
		else if((pFirst.getContenuto().length())==(stringa.length())) {
			return 1 + ifEqualsRic(pFirst.getNext(), stringa);
		}
		else {
			return ifEqualsRic(pFirst.getNext(), stringa);
		}
	}
	
	public int maxLenghtWhile(){
		Elemento pFirstTmp = pFirst;
		int risultato = 0;
		while(pFirstTmp != null) {
			if((pFirstTmp.getContenuto().length()) > risultato) {
				risultato = pFirstTmp.getContenuto().length();
				pFirstTmp = pFirstTmp.getNext();
			}
			pFirstTmp = pFirstTmp.getNext();
		}
		return risultato;
	}
	
	public int maxLenghtFor() {
		int risultato = 0;
		for(Elemento pFirstTmp = pFirst; pFirstTmp != null; pFirstTmp = pFirstTmp.getNext()) {
			if((pFirstTmp.getContenuto().length())> risultato) {
				risultato = pFirstTmp.getContenuto().length();
			}
		}
		return risultato;
	}
	
	public int maxLenghtRic() {
		return maxLenghtRic(this.pFirst);
	}
	
	private int maxLenghtRic(Elemento pFirst) {
		if(pFirst == null) {
			return 0;
		}
		int lunghezza = pFirst.getContenuto().length();
		if(lunghezza < (maxLenghtRic(pFirst.getNext()))) {
			return maxLenghtRic(pFirst.getNext());
		}
		else {
			return lunghezza;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
