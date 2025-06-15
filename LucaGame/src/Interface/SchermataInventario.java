package Interface;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchermataInventario extends JPanel{

    private final String titolo = "Inventario Personaggio";
    private Font grassettoFont = new Font("Arial", Font.BOLD, 14);

    public SchermataInventario(){

        this.add(new JLabel(titolo));

    }

}
