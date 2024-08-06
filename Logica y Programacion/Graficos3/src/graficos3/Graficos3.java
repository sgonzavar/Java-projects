
package graficos3;

import javax.swing.JFrame;


public class Graficos3 {

   
    public static void main(String[] args) {
         JFrame frame = new JFrame("Uso De Fuentes ");
        FontPanel  panel = new FontPanel();
        frame.add(panel);
        frame.setSize(475, 170);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
