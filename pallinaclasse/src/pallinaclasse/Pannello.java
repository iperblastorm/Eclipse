package pallinaclasse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;


public class Pannello extends JPanel implements Runnable{ // si comporta da thread perche implemento runnable
	
	Thread t = null;//NON HO IL EMTODO START CHIEDO AIUTO A THREAD
	
	Palline p;
	Palline[] ap;//VETTORE DI PALLINE
	
	private boolean attivo = true;
	
	
	public Pannello() {

		setBackground(Color.white);
		Random r= new Random();
		
		p = new Palline(30, Color.RED, 0, 0, 6, 6);//UNA PALLINA
		
		ap = new Palline[10+r.nextInt(10)];//ISTANZIO VETTORE DI PALLINE CASUALI
		
		for(int i = 0; i < ap.length; i++) { //ISTANZIO TUTTE LE PALLINE CICLO FOR VALORI CASUALI
			ap[i] = new Palline(10+r.nextInt(30), Color.getHSBColor(r.nextFloat(), 1.0f /**CONVERTO A FLOAT*/, 1.0f), 0, 0, 2+r.nextInt(15), 2+r.nextInt(15));//H TINTA S SATURAZIONE B LUMINOSITA USO QUESTA PERCHE POSSO DIRE METTO LUMINOSITA AL MASSIMO E METTO CASUALI I COLORI POSSO CREARE COLORI CHE SFUMANO L'UNO NELL ALTRO
			}		
			
			t = new Thread(this);
			t.start();
			attivo = true;
	}
	@Override
	public void paintComponent(Graphics g) {//comincio a disegnare
		super.paintComponent(g);//prendo il metodo paintcomponent
		g.setColor(p.c);
		g.fillOval(p.x, p.y, p.diametro, p.diametro);
		
		for(Palline ap1 : ap) {
			g.setColor(ap1.c);
			g.fillOval(ap1.x, ap1.y, ap1.diametro, ap1.diametro);
		}
		
		
	}

	public void run() {
		
		while(true) {
		this.repaint();
		
		p.sposta(this.getWidth(), this.getHeight());
		
		for(Palline ap1 : ap) {
			ap1.sposta(this.getWidth(), this.getHeight());
		}
		
		try {
			t.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//DISEGNO A 10 FOTOGRAMMI AL SECONDO
		
		}
	}
	
}
