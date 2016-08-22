package window;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow extends JMenuBar {
	
	private JFrame frame;
	private JButton btnNewUser, btnButton, btnClose;
	private JMenu mFile, mAbout;
	String[ ] fileItems = new String[ ] { "Table" };

	
				// uruchomienie //
	public static void main(String[] args){
		 
		 EventQueue.invokeLater(new Runnable()
		    {
		            @Override
		            public void run()
		            {
		             MainWindow window = new MainWindow();
		    window.frame.setVisible(true);
		            }
		    });
		}
public MainWindow(){
	initialize(); 
	}

				// inicjalizacja ramki//

private void initialize() {
    GridLayout gridLayout = new GridLayout(3,1);
	frame = new JFrame("Skills Matrix"); // nazwa okna
	frame.setSize(300, 300);			//wielkosc okna 
	frame.setLocationRelativeTo(null);	//
	frame.setResizable(true);  		 //okno nie zmienia rozmiarow
	
	frame.getContentPane().setLayout(null); 
	
	//gorne menu
	JMenuBar menuBar = new JMenuBar();
	frame.setJMenuBar(menuBar);
	
	mFile = new JMenu("File");		//File Menu
	menuBar.add(mFile);
	
	ActionListener printListener = new ActionListener(  ) {
        public void actionPerformed(ActionEvent event) {
         
        }
     };
     for (int i=0; i < fileItems.length; i++) {
        JMenuItem item = new JMenuItem(fileItems[i]);
        mFile.add(item);

        
        mAbout = new JMenu("About");  
        menuBar.add(mAbout);
        
        JMenuItem mntmAbout = new JMenuItem("About");
        mntmAbout.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
          new AboutWindow();
          frame.setVisible(false);
          window.AboutWindow.main(null);
          }
              });
        mntmAbout.setToolTipText("Information about application");
        mAbout.add(mntmAbout);
	
	//dodwanie nowego pracownika
	
	btnNewUser = new JButton("New User");
	btnNewUser.setBounds(75, 60,150,30);
	btnNewUser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new NewUser();
			frame.setVisible(false);
				
			
		}
	});
	btnNewUser.setToolTipText("Adds New User");
	frame.getContentPane().add(btnNewUser);
	
	//cos tu bedzie
	
	btnButton = new JButton("Jakis knefel");
	btnButton.setBounds(75,100,150,30);
	frame.getContentPane().add(btnButton);
	
	//zamkniecie apki
	
	btnClose = new JButton("Close");
	btnClose.setBounds(75,140,150,30);
	frame.getContentPane().add(btnClose);
	btnClose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
		});
		btnClose.setToolTipText("Close App");
		frame.getContentPane().add(btnClose);
	}
}
}