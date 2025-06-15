package polimorf1;

public abstract class Tennista {
	String nome ;
	private int anniIscritto = 0;
	
	public Tennista(String nome) {
		this.nome = nome;
	}
	
	public void rinnovo () {
		anniIscritto++;
	}

	public int getAnniIscritto() {
		return(this.anniIscritto);
	}
	
	public abstract int costoIscrizione();
}

class Professionista extends Tennista{
	int punteggio;
	private int costoBase = 500;
	
	public Professionista(String nome,int punteggio) {
		super(nome);
		this.punteggio = punteggio;
	}
	
	public int costoIscrizione() {
		rinnovo();
		if(this.punteggio < 2000) {
			return (costoBase + 100);
		}
		else {
			return costoBase;
		}
	}
}

class Dilettante extends Tennista {
	int numeroTornei;
	private int costoBase = 300;
	
	public Dilettante (String nome, int numero) {
		super(nome);
		this.numeroTornei = numero;
	}
	
	public int costoIscrizione() {
		rinnovo();
		if (numeroTornei < 20) {
			return (costoBase + 150);
		}
		else {
			return costoBase;
		}
	}
}