package Interface;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SchermataSkill extends JPanel{

    private final String titolo = "Skill Personaggio";
    private Font grassettoFont = new Font("Arial", Font.BOLD, 14);

    public SchermataSkill(){

        this.add(new JLabel(titolo));
    }

}
