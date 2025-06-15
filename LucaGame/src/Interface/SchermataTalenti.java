package Interface;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchermataTalenti extends JPanel {

    private final String titolo = "Talenti Personaggio";
    private Font grassettoFont = new Font("Arial", Font.BOLD, 14);

    public SchermataTalenti(){

        this.add(new JLabel(titolo));
    }

}
