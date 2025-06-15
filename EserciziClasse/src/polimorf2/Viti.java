package polimorf2;

public abstract class Viti {
	float diametro = 0;
	private boolean zincata;
	
	public Viti (float diametro) {
		this.diametro = diametro;
		this.zincata = false;
	}
	
	public void zincatura() {
		this.zincata = true;
	}
	
	public boolean getZincatura() {
		return this.zincata;
	}
	
	public abstract double costo();
}


class VitiLegno extends Viti{
	boolean aStella;
	
	public VitiLegno(float diametro,boolean stella) {
		super(diametro);
		this.aStella = stella;
	}
	
	public double costo() {
		double risultato = 0;
		risultato = (this.diametro * 0.01);
		if((this.getZincatura())== true) {
			risultato += 0.1;
		}
		if (this.aStella == true) {
			risultato += 0.1;
		}
		return risultato;
	}
}

class VitiFerro extends Viti{
	boolean acciaio;
	
	public VitiFerro(float diametro,boolean acciaio) {
		super(diametro);
		this.acciaio = acciaio;
	}
	
	public double costo(){
		double risultato = 0;
		risultato = diametro * 0.02;
		
		if((this.getZincatura()) == true) {
			risultato += 0.2;
			}
		
		if(this.acciaio == true) {
			risultato += 0.1;
			}
		return risultato;
		}
	}
