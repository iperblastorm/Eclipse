package main;
//import java.awt.GraphicsDevice;
//import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import Interface.InterfacciaPrincipale;

public class App {
    public static void main(String[] args) throws Exception {
        //ACCESSO A RISORSE GRAFICHE DI SISTEMA
        //GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        //RAPPRESENTA IL MONITOR
        //GraphicsDevice gd = ge.getDefaultScreenDevice();

        //CREO LA FINESTRA
        JFrame finestra = new JFrame("Il mio gioco");
        //DICO CHE IL TASTO X DEVE CHIUDERE
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //IMPOSTO DIMENSIONE FINESTRA
        finestra.setSize(600, 600);
        //PAGINA INIZIALE
        InterfacciaPrincipale schermataIniziale = new InterfacciaPrincipale();
        //AGGIUNGO IL PANNELLO ALLA FINESTRA
        finestra.getContentPane().add(schermataIniziale);
        finestra.setVisible(true);

    }
}