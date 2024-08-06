
package graficos4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Figuras  extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        setBackground(Color.WHITE);
        g.setColor(Color.RED);
        g.drawLine(0, 20, 400, 20);
        
        g.setColor(Color.BLUE);
        g.drawRect(5, 40, 90, 55);
        g.fillRect(100, 40, 90, 55);
        
        g.setColor(Color.CYAN);
        g.drawRoundRect(195, 40, 90, 55, 50, 50);
        g.fillRoundRect(290, 40, 90, 55, 400, 400);
        
        g.setColor(Color.YELLOW);
        g.draw3DRect(5, 100, 90, 55, true);
        g.fill3DRect(100, 100, 90, 55, true);
        
         g.setColor(Color.magenta);
        g.drawOval(195, 100, 90, 55);
        g.fillOval(290, 100, 90, 55);
        
        
        
    }
    









}
