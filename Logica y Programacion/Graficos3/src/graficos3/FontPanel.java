package graficos3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;


public class FontPanel extends JPanel{

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        
        grphcs.setFont(new Font ("serif", Font.BOLD, 12));
        grphcs.drawString(grphcs.getFont().getName() + " " + grphcs.getFont().getSize(), 20, 50);
        
        grphcs.setFont(new Font ("Monospaced", Font.ITALIC, 24));
        grphcs.setColor(Color.PINK);
        grphcs.drawString(grphcs.getFont().getName() + " " + grphcs.getFont().getSize(), 20, 70);
    
         grphcs.setFont(new Font ("SansSerif", Font.PLAIN, 14));
        grphcs.setColor(Color.DARK_GRAY);
        grphcs.drawString(grphcs.getFont().getName() + " " + grphcs.getFont().getSize(), 20, 90);
     
        grphcs.setFont(new Font ("Serif", Font.BOLD + Font.ITALIC, 18));
        grphcs.setColor(Color.RED);
        grphcs.drawString(grphcs.getFont().getName() + " " + grphcs.getFont().getSize(), 20, 110);
    
    }
    















}
