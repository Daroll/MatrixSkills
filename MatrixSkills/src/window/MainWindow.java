package window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints buttonmainwindow = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
        	buttonmainwindow.fill = GridBagConstraints.HORIZONTAL;
        }

        button = new JButton("New User");
        buttonmainwindow.ipady = 40; // make button tall for 40px 
        buttonmainwindow.ipadx = 100; // make button width for 100px
        buttonmainwindow.gridy = 0; // first row
        buttonmainwindow.weighty = 1.0; 
        buttonmainwindow.insets = new Insets(30,30,30,30);  //padding
        
        pane.add(button, buttonmainwindow);

        button = new JButton("Knefel");
        buttonmainwindow.ipady = 40;
        buttonmainwindow.ipadx = 100;
        buttonmainwindow.gridy = 1; // second row
        buttonmainwindow.insets = new Insets(30,30,30,30);
        buttonmainwindow.weighty = 1.0;
        buttonmainwindow.weightx = 0.0;
        buttonmainwindow.gridwidth = 3;
        
        pane.add(button, buttonmainwindow);

        button = new JButton("Close");
        buttonmainwindow.ipady = 40;
        buttonmainwindow.ipadx = 100;
        buttonmainwindow.insets = new Insets(30,30,30,30);
        buttonmainwindow.gridy = 2;       //third row
        pane.add(button, buttonmainwindow);
        
      	button.addActionListener(new ActionListener() {
      		public void actionPerformed(ActionEvent arg0) {
      			System.exit(0);
      		}
      		});
        
        
    }
    
    

    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Skills Matrix");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300, 400));

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}