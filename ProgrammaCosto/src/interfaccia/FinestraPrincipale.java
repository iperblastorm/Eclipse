package interfaccia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import personalClass.GBCH;
import resourceData.Resource;

public class FinestraPrincipale extends JFrame {
	private static final long serialVersionUID = 1L;
	JFrame finestraPrincipale;
	String titolo = "Programma Costo";
	
	public FinestraPrincipale() {
		finestraPrincipale = new JFrame(titolo);
		finestraPrincipale.setSize(700,500);
		finestraPrincipale.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		finestraPrincipale.add(new pannelloAlto(),BorderLayout.NORTH);
		finestraPrincipale.add(new PannelloDestro(),BorderLayout.EAST);
		finestraPrincipale.add(new PannelloSinistro(),BorderLayout.WEST);
		finestraPrincipale.setVisible(true);
	}

}

class pannelloAlto extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public pannelloAlto() {
		this.setLayout(new GridBagLayout());
		this.setBorder(new LineBorder(Color.BLUE, 2));
		
		titolo();
	}
	
	private void titolo() {
		JLabel titolo = new JLabel("Ricette");
		GBCH layoutTitolo = new GBCH(0, 0);
		layoutTitolo.fill(GridBagConstraints.HORIZONTAL);
		layoutTitolo.add(this, titolo);
	}
}


class PannelloSinistro extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public PannelloSinistro() {
		this.setLayout(new GridBagLayout());
		this.setBorder(new LineBorder(Color.BLACK,2));
		
		this.ingredienti();
		this.quantita();
		this.riempi();
	}

	
	private void ingredienti() {
		JLabel etichettaIngredienti = new JLabel("Ingredienti");
		GBCH etichettaILayout = new GBCH(0, 0);
		etichettaILayout.anchor(GridBagConstraints.NORTHWEST);
		etichettaILayout.insets(5, 5, 5, 5);
		etichettaILayout.fill(GridBagConstraints.NONE);
		etichettaILayout.add(this, etichettaIngredienti);
		
		JLabel etichettaQuantita = new JLabel("Quantità");
		GBCH etichettaQLayout = new GBCH(1, 0);
		etichettaQLayout.anchor(GridBagConstraints.NORTH);
		etichettaQLayout.insets(5, 5, 5, 5);
		etichettaQLayout.fill(GridBagConstraints.NONE);
		etichettaQLayout.add(this, etichettaQuantita);
		
	}
	
	private void quantita() {
		
		String[] ingredienti = {"alalalalalala","b","c","d"};
		JComboBox<String> comboIngredienti = new JComboBox<>(ingredienti);
		GBCH comboLayout = new GBCH(0,1);
		comboLayout.weightxY(1.0, 0.0);
		comboLayout.insets(5, 5, 5, 5);
		comboLayout.fill = GridBagConstraints.HORIZONTAL;
		comboLayout.add(this, comboIngredienti);
		
		
		JTextField quantità = new JTextField(15);
		GBCH quantitaLayout = new GBCH(1,1);
		quantitaLayout.insets(5, 5, 5, 5);
		quantitaLayout.fill(GridBagConstraints.VERTICAL);
		quantitaLayout.add(this, quantità);
		
		ImageIcon icona = new ImageIcon(Resource.immaginePlus());
		JButton inserisciNuovo = new JButton(icona);
		inserisciNuovo.setBorderPainted(false);
		inserisciNuovo.setContentAreaFilled(false);
		inserisciNuovo.setIcon(icona);
		GBCH inserisciNuovoLayout = new GBCH(2,1);
		inserisciNuovoLayout.anchor(GridBagConstraints.CENTER);
		inserisciNuovoLayout.fill(GridBagConstraints.BOTH);
		inserisciNuovoLayout.add(this, inserisciNuovo);
		
	}
	
	private void riempi() {
		JLabel riempi = new JLabel();
		GBCH riempiLayout = new GBCH(0, 2);
		riempiLayout.fill(GridBagConstraints.VERTICAL);
		riempiLayout.weightxY(1.0, 1.0);
		riempiLayout.grid(2, 1);
		riempiLayout.add(this, riempi);
		
	}

}


class PannelloDestro extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PannelloDestro() {
		this.setLayout(new GridBagLayout());
		this.setBorder(new LineBorder(Color.RED,2));
		
		
		// TODO Auto-generated constructor stub
	}
	
}


