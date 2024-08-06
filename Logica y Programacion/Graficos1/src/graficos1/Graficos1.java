package graficos1;

import javax.swing.JFrame;

public class Graficos1 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Uso De Colores ");
        JPanelColor panel = new JPanelColor();
        frame.add(panel);
        frame.setSize(400, 180);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
