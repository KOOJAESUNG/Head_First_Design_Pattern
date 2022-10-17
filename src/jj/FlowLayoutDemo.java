package jj;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.BoxLayout;

public class FlowLayoutDemo extends JPanel {
    protected JButton[] buttons;
    static final int NUM_BUTTONS = 5;
    
    public FlowLayoutDemo() {
        setLayout(new FlowLayout());
        buttons = new JButton[NUM_BUTTONS];
        
        for (Integer i = 0; i < NUM_BUTTONS; i++) {
            buttons[i] = new JButton(i.toString());
            add(buttons[i]);
        }
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Layout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        FlowLayoutDemo newContentPane = new FlowLayoutDemo();
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
}
