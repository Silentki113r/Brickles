import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
//Lachlan Schahinger, 2107393 scha0147
/**
 * A starter class for a Director-pattern Swing application program.
 */

public class go {

    /**
     * Runs the program by creating a Director and passing it the
     * command-line arguments
     */
    public static void main(String args[]) {
        JFrame window = new JFrame();
        window.setTitle("Brickles");
        Director director = new Director(window, args);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.pack();
        window.setVisible(true);
        
    }
 
 
            
}
