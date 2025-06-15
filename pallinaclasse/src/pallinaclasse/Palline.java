package pallinaclasse;

import java.awt.Color;

public class Palline {//MODIFICO LE PALLINE
	
	int diametro;
	Color c;
	
	int x;
	int y;
	
	int vx; 
	int vy;
	
	
	public Palline(int diametro, Color c, int x, int y, int vx, int vy) {
		super();
		this.diametro = diametro;
		this.c = c;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void sposta(int lunghezza, int altezza) { //CON QUESTO METODO SPOSTO LA PALLINA PUBLIC PERCHE LA SPOSTO IO
		//PRENDE LUNGHEZZA E ALTEZZA CHE SONO QUELLE DELLA FINESTRA
		
		if(vx < 0 && x <= 0) { //QUI SBATTO A SINISTRA NEL CASO HO TOCCATO È = SE È < HO PASSATO IL LIMITE
			vx = -vx;//INVERTO DIREZIONE
		}
		else if (vx > 0 && (x + diametro) >= lunghezza) { //QUI SBATTO A DX QUINDI CONSIDERO
			vx = -vx;//INVERTO DIREZIONE
		}
		else if(vy < 0 && y <= 0) { // QUAI SBATTO SOTTO
			vy = -vy;//INVERTO DIREZIONE
		}
		else if (vy > 0 && (y + diametro) >= altezza) { //QUI SBATTO A SOPRA
			vy = -vy;//INVERTO DIREZIONE
		}
		else { //QUI LE PALLINE SCORRONO NORMALMENTE
			x += vx;
			y += vy;
		}
	}
	

}
