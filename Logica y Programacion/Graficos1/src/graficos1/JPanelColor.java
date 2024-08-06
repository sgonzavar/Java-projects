
package graficos1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public class JPanelColor extends JPanel {

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); 
        setBackground(Color.BLACK);
        grphcs.setColor(new Color(255, 0, 0));
        grphcs.fillRect(15, 25, 100, 20);
        grphcs.drawString("RGB ACTUAL" + grphcs.getColor(),130, 40);
        
        grphcs.setColor(new Color(.5f, .75f, .0f));
        grphcs.fillRect(15, 50, 100, 20);
        grphcs.drawString("RGB ACTUAL" + grphcs.getColor(),130, 65);
        
        grphcs.setColor( Color.BLUE);
        grphcs.fillRect(15, 75, 100, 20);
        grphcs.drawString("RGB ACTUAL" + grphcs.getColor(),130, 90);
        
        Random rd = new Random();
        grphcs.setColor(new Color(rd.nextInt(255),rd.nextInt(255),rd.nextInt(255)));
        grphcs.fillRect(15, 100, 100, 20);
        grphcs.drawString("RGB ACTUAL" + grphcs.getColor(),130, 115);
        
        
    }

}
