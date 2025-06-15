package polimorf1;

import java.util.Random;

public class Circolo {
	Tennista iscritti[];
	
	public Circolo(int n,int m) {
		iscritti = new Tennista [(n+m)];
		Random random = new Random();
		
		for (int elemento = 0;elemento < n; elemento++) {
			String nome = "";
			for (int nomeCasuale = 0 ; nomeCasuale < (random.nextInt(3)); nomeCasuale ++) {
				nome += "ciao";
			}
			iscritti[elemento]= new Professionista(nome,(random.nextInt(3000)));
		}
		
		for(int elemento = n; elemento < (iscritti.length) ; elemento++) {
			String nome = "";
			for(int nomeCasuale = 0; nomeCasuale < (random.nextInt(3)); nomeCasuale++) {
				nome += "ciao";
			}
			iscritti[elemento] = new Dilettante(nome, random.nextInt(30));
		}
		
		for(Tennista elemento : iscritti) {
			for(int numero = 0; numero < (random.nextInt(4)); numero++) {
				elemento.costoIscrizione();
			}
		}
	}
	
	public float mediaCircolo (int numeroAnni) {
		float risultato = 0;
		int conteggio = 0;
		
		for(Tennista elemento : iscritti) {
			if((elemento.getAnniIscritto()) > numeroAnni) {
				risultato += elemento.costoIscrizione();
				conteggio++;
			}
		}
		if (conteggio > 0) {
			risultato = risultato / conteggio;
		}
		return risultato;
	}

}
