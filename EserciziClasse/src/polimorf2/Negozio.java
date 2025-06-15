package polimorf2;

import java.util.Random;

public class Negozio {
	Viti v [];
	
	public Negozio(int n, int m) {
		v = new Viti [n+m] ;
		Random random = new Random();
		for(int elemento = 0; elemento < n ; elemento ++) {
			v[elemento]= new VitiLegno(random.nextFloat(), random.nextBoolean());
			Boolean zincata = random.nextBoolean();
			
			if(zincata == true) {
				v[elemento].zincatura();
			}
		}
		for(int elemento = n; elemento < (v.length); elemento ++) {
			v[elemento] = new VitiFerro(random.nextFloat(),random.nextBoolean());
			boolean zincata = random.nextBoolean();
			if(zincata == true) {
				v[elemento].zincatura();
				}
			}
		}
	
	public double negozio (float d) {
		double risultato = Double.MAX_VALUE;
		for(Viti elemento : v) {
			if((elemento.diametro) == d) {
				if(risultato < elemento.costo()) {
					risultato = elemento.costo();
				}
			}
		}
		return risultato;
	}
	
	public void isZincata (float costo) {
		for(Viti elemento : v) {
			if(elemento.getZincatura() == true) {
				if ((elemento.costo()) < costo) {
					System.out.println("Esiste una vite zincata che costa meno");
				}
				else {
					System.out.println("non esiste una vite zincata che costa meno");
				}
			}
		}
	}

}
