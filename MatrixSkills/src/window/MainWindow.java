package window;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

public class MainWindow extends JMenuBar {
	
	private JFrame frame;
	private JButton btnNewUser, btnReport, btnClose;
	private JMenu mFile, mAbout;

	
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
    frame = new JFrame("Skills Matrix"); // nazwa okna
	frame.setSize(600, 500);			//wielkosc okna 
	frame.setLocationRelativeTo(null);	//
	frame.setResizable(false);  		 //okno nie zmienia rozmiarow
	
	frame.getContentPane().setLayout(null); 
	
	//gorne menu
	JMenuBar menuBar = new JMenuBar();
	frame.setJMenuBar(menuBar);
	frame.setIconImage(new javax.swing.ImageIcon(getClass().getResource("Siimage.png")).getImage());

	
	// menu File
	mFile = new JMenu("File");		//File Menu
	menuBar.add(mFile);
	ImageIcon iconAdd =new ImageIcon(getClass().getResource("users.png") ); //ikony do menu 18x18px
	ImageIcon iconReport =new ImageIcon(getClass().getResource("notepad.png") );
	ImageIcon iconExit =new ImageIcon(getClass().getResource("exit.png") );
	ImageIcon iconAbout =new ImageIcon(getClass().getResource("agenda.png") );
	
    JMenuItem mntmNewUser = new JMenuItem("New User", iconAdd);
    mntmNewUser.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      new NewUser();
      frame.setVisible(false);
      window.NewUser.main(null);
      }
          });
    mntmNewUser.setToolTipText("Adds New User");
    mntmNewUser.setAccelerator(KeyStroke.getKeyStroke(
            KeyEvent.VK_N, ActionEvent.CTRL_MASK));
    mFile.add(mntmNewUser);
    

    JMenuItem mntmReport = new JMenuItem("Report", iconReport);
    mntmReport.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      new Report();
      frame.setVisible(false);
      window.Report.main(null);
      }
          });
    mntmReport.setToolTipText("Show Report");
    mntmReport.setAccelerator(KeyStroke.getKeyStroke(  	// skrót klawiszowy
       KeyEvent.VK_R, ActionEvent.CTRL_MASK));
    mFile.add(mntmReport);
    
    JSeparator separator = new JSeparator();
    mFile.add(separator);
    
    
    JMenuItem mntmClose = new JMenuItem("Close", iconExit);
    mntmClose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
		});
		mntmClose.setToolTipText("Close App");
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(	// skrót klawiszowy
	    KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		mFile.add(mntmClose);
  
	// menu About
        mAbout = new JMenu("About");  
        menuBar.add(mAbout);
        
        JMenuItem mntmAbout = new JMenuItem("About", iconAbout);
        mntmAbout.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
          new AboutWindow();
          frame.setVisible(false);
          window.AboutWindow.main(null);
          }
              });
        mntmAbout.setToolTipText("Information about application");
        mntmAbout.setAccelerator(KeyStroke.getKeyStroke(	// skrót klawiszowy
		KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        mAbout.add(mntmAbout);
        
        
        JLabel logo = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("Siimage.png")).getImage();
        logo.setIcon(new ImageIcon(img));
        
        logo.setBounds(225, 20, 140, 100);
        frame.getContentPane().add(logo);
	
	//dodwanie nowego pracownika
	
    	btnNewUser = new JButton("New User");
    	btnNewUser.setBounds(187, 170, 226, 40);
    	btnNewUser.setFont(new Font("Calibri", Font.BOLD, 20));
    	btnNewUser.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new NewUser();
    			frame.setVisible(false);
    			window.NewUser.main(null);
    			
    		}
    	});
    	btnNewUser.setToolTipText("Adds New User");
    	frame.getContentPane().add(btnNewUser);
	
	//cos tu bedzie
	
	btnReport = new JButton("Report");
	btnReport.setBounds(187,240,226,40);
	btnReport.setFont(new Font("Calibri", Font.BOLD, 20));
	btnReport.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new NewUser();
			frame.setVisible(false);
			window.Report.main(null);
			
		}
	});
	btnReport.setToolTipText("Show Report");
	frame.getContentPane().add(btnReport);
	
	//zamkniecie apki
	
	btnClose = new JButton("Close");
	btnClose.setBounds(187,310,226,40);
	btnClose.setFont(new Font("Calibri", Font.BOLD, 20));
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
