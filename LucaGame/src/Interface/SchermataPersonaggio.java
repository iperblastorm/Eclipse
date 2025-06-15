package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchermataPersonaggio extends JPanel {

    private final String titolo = "Scheda Personaggio";
    private final String forza = "Forza: ";
    private final String agilita = "Agilita: ";
    private final String intelletto = "Intelletto: ";
    private final String spirito = "Spirito: ";
    private final String difesa = "Difesa: ";
    private final String attacco = "Attacco: ";

    // CREA UNA VARIABILE CON DENTRO L'IMMAGINE
    private BufferedImage sfondo;
    private Font grassettoFont = new Font("Arial", Font.BOLD, 14);
    

    public SchermataPersonaggio() {

        //QUESTO PEZZO SI OCCUPA DELLO SFONDO IN LEGNO
        try {
            //CREA UN FILE CON L'IMMAGINE DELLO SFONDO
            File fileImmagine = new File("./Resource/background.jpg");
            //LEGGE L'IMMAGINE E LA TRASFORMA IN UNA BUFFERED IMAGE
            sfondo = ImageIO.read(fileImmagine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        //JLABEL COMPLETA
        JLabel titololbl = new JLabel(titolo);
        titololbl.setForeground(Color.BLACK);
        titololbl.setFont(grassettoFont);

        JLabel forzalbl = new JLabel(forza);
        forzalbl.setForeground(Color.BLACK);
        forzalbl.setFont(grassettoFont);

        JLabel agilbl = new JLabel(agilita);
        agilbl.setForeground(Color.BLACK);
        agilbl.setFont(grassettoFont);

        JLabel intlbl = new JLabel(intelletto);
        intlbl.setForeground(Color.BLACK);
        intlbl.setFont(grassettoFont);

        JLabel sprlbl = new JLabel(spirito);
        sprlbl.setForeground(Color.BLACK);
        sprlbl.setFont(grassettoFont);

        JLabel deflbl = new JLabel(difesa);
        deflbl.setForeground(Color.BLACK);
        deflbl.setFont(grassettoFont);

        JLabel attlbl = new JLabel(attacco);
        attlbl.setForeground(Color.BLACK);
        attlbl.setFont(grassettoFont);


        // AGGIUNGO ELEMENTI ALL'INTERFACCIA
        this.setLayout(new GridBagLayout());

        GridBagConstraints titolo = new GridBagConstraints();
        GridBagConstraints statistiche = new GridBagConstraints();

        //IMPOSTO IL CONTENITORE DEL TITOLO
        titolo.gridx = 1;titolo.gridy = 0;
        titolo.weighty = 0.01; titolo.weightx = 1.0;
        titolo.gridwidth = 2; titolo.anchor = GridBagConstraints.PAGE_START;
        this.add(titololbl, titolo);


        statistiche.gridx = 0; statistiche.gridy = 1;
        statistiche.weighty = 0.01; statistiche.weightx = 0.01;
        statistiche.anchor = GridBagConstraints.NORTHWEST;
        this.add(attlbl, statistiche);

        statistiche.gridx = 0; statistiche.gridy = 2;
        statistiche.weighty = 0.01; statistiche.weightx = 0.01;
        this.add(forzalbl, statistiche);

        statistiche.gridx = 0; statistiche.gridy = 3;
        statistiche.weighty = 0.01; statistiche.weightx = 0.01;
        this.add(agilbl, statistiche);

        statistiche.gridx = 0; statistiche.gridy = 4;
        statistiche.weighty = 0.01; statistiche.weightx = 0.01;
        this.add(intlbl, statistiche);

        statistiche.gridx = 0; statistiche.gridy = 5;
        statistiche.weighty = 1.0; statistiche.weightx = 0.01;
        this.add(deflbl, statistiche);

    }

    //QUI DICO CHE VOGLIO PRENDERE PAINTCOMPONENT DELLA CLASSE JPANEL E SOSTITUIRLA CON QUESTA
    @Override
    protected void paintComponent(Graphics g) {  // RICOPIO L'INTESTAZIONE DELLA CLASSE ORIGINALE
    // QUI GLI DICO DI PREPARARE IL PANNELLO PER ESSERE DISEGNATO
    super.paintComponent(g);
    if(sfondo != null){
        //DISEGNA LO SFONDO A TUTTO SCHERMO TRANNE CHE IN BASSO
        g.drawImage(sfondo, 0, 0,getWidth(),getHeight(), this);
        }
    }
}
