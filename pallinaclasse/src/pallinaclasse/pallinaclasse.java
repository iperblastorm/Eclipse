package pallinaclasse;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class pallinaclasse extends javax.swing.JFrame {
	Pannello pannello;
	
	

	public pallinaclasse(String titolo) throws HeadlessException {
		pannello = new Pannello();
		pannello.setBounds(0,0,WIDTH,HEIGHT);
		add(pannello);
		
	} 
	
	public static void main(String[] args) {
		 pallinaclasse finestra = new pallinaclasse ("Mia applicazione");
		 finestra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 finestra.setBounds(50,300, 800,1000);
		 finestra.setVisible(true);
	}

}
