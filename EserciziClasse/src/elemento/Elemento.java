package elemento;

public class Elemento {
	String contenuto;
	Elemento next;
	
	public Elemento(String contenuto, Elemento successivo) {
		this.contenuto = contenuto;
		this.next = successivo;
	}

	public String getContenuto() {
		return contenuto;
	}

	public Elemento getNext() {
		return next;
	}

}
