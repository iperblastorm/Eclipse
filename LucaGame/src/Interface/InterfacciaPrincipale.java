package Interface;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class InterfacciaPrincipale extends JPanel {

    //FACCIO PARTIRE LA CLASSE CON UN UNICA SCHERMATA PRINCIPALE
    private BorderLayout layout;
    private JPanel pannelloPrincipale;
    private CardLayout cardLayout;
    private JPanel contenutoCentrale;

    //METODO CHE CREA LA SCHERMATA PRINCIPALE
    public InterfacciaPrincipale(){

        //LAYOUT PAGINA PRINCIPALE
        layout = new BorderLayout();
        pannelloPrincipale = new JPanel(layout);

        //CARD LAYOUT CENTRALE
        cardLayout = new CardLayout();
        contenutoCentrale = new JPanel(cardLayout);

        //CREO IL PANNELLO PER I BOTTONI PER LO SWITCH PAGINE
        JPanel pannelloBottoni= new JPanel();

        //CREA LE VARIE SCHERMATE
        contenutoCentrale.add(new SchermataPersonaggio(), "Personaggio");
        contenutoCentrale.add(new SchermataInventario(), "Inventario");
        contenutoCentrale.add(new SchermataSkill(), "Skill");
        contenutoCentrale.add(new SchermataTalenti(),"Talenti");

        //AGGIUNGE LE SCHEMRATE CENTRALI AL PANNELLO PRINCIPALE
        pannelloPrincipale.add(contenutoCentrale, BorderLayout.CENTER);

        //CREO I BOTTONI
        JButton btnPersonaggio = new JButton("Personaggio");
        JButton btnInventario = new JButton("Inventario");
        JButton btnSkill = new JButton("Skill");
        JButton btnTalenti= new JButton("Talenti");

        //AGGIUNGO IL LISTENER PER QUANDO PREMO I BOTTONI
        btnPersonaggio.addActionListener(e -> cardLayout.show(contenutoCentrale,"Personaggio"));
        btnInventario.addActionListener(e -> cardLayout.show(contenutoCentrale, "Inventario"));
        btnSkill.addActionListener(e -> cardLayout.show(contenutoCentrale, "Skill"));
        btnTalenti.addActionListener(e -> cardLayout.show(contenutoCentrale,"Talenti"));

        //AGGIUNGO I BOTTONI AL PANNELLO DEI BOTTONI
        pannelloBottoni.add(btnPersonaggio);
        pannelloBottoni.add(btnInventario);
        pannelloBottoni.add(btnSkill);
        pannelloBottoni.add(btnTalenti);

        //METTO IL PANNELLO BOTTONI IN BASSO
        pannelloPrincipale.add(pannelloBottoni,BorderLayout.SOUTH);

        //LAYOUT PAGINE PRINCIPALE
        this.setLayout(new BorderLayout());
        this.add(pannelloPrincipale, BorderLayout.CENTER);
    }

}
