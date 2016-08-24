package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;





public class Report { 

	private JFrame frame;
	private JButton btnCancel;
	private JMenu mFile, mAbout;
	
	//uruchomienie
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Report window = new Report();
						window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();}
				}
		});
	}

	public Report(){

	initialize(); 
}

//inicjalizacja ramki

	public void initialize() {
	frame = new JFrame("Report");
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setLayout(null); 

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
	
	// Powrot do menu
	
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(20, 385, 80, 50);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				window.MainWindow.main(null);	
				
			}
			});
			frame.getContentPane().add(btnCancel);
			btnCancel.setToolTipText("Go back to Menu");

		
	}
	}