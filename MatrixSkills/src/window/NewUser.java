package window;

import java.awt.EventQueue;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import sql.User;





public class NewUser { 

	private JFrame frame;
	private JButton btnCancel, btnAddUser;
	private JMenu mFile, mAbout;
	
	//uruchomienie
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						NewUser window = new NewUser();
						window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();}
				}
		});
	}

	public NewUser(){

	initialize(); 
}

//inicjalizacja ramki

	public void initialize() {
	frame = new JFrame("Add New User");
	frame.setSize(600,500);
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
	

//DODAWANIE DANYCH

//Pole imie

	JLabel name = new JLabel("Name");
	name.setBounds(20, 10, 70, 20);
	frame.getContentPane().add(name);
	
	final JTextField nameField = new JTextField("");
	nameField.setBounds(100, 10, 300, 20);
	frame.getContentPane().add(nameField);
	
//Naziwsko
	
	JLabel surname = new JLabel ("Surname");
	surname.setBounds(20, 40, 70, 20);
	frame.getContentPane().add(surname);
	
	final JTextField surnameField = new JTextField ("");
	surnameField.setBounds(100, 40, 300, 20);
	frame.getContentPane().add(surnameField);
	
// Sta¿ - nazewnictwo do zmiany
	
	JLabel experience = new JLabel ("Experience");
	experience.setBounds(20, 70, 70, 20);
	frame.getContentPane().add(experience);
	
	final JTextField experienceField = new JTextField ("");
	experienceField.setBounds(100, 70, 30, 20);
	frame.getContentPane().add(experienceField);
	
// Pole na inf
	
	JLabel info = new JLabel ("Additional");
	info.setBounds(20, 100, 70, 20);
	frame.getContentPane().add(info);
	
	JLabel info2 = new JLabel ("Information");
	info2.setBounds(20, 115, 70, 20);
	frame.getContentPane().add(info2);
	
	final JTextArea infoArea = new JTextArea ("");
	infoArea.setBounds(100, 100, 300, 50);
	frame.getContentPane().add(infoArea);
	
// Kolejna strona
	
	
	btnAddUser = new JButton("Next");
	btnAddUser.setBounds(400, 385, 70, 50);
	btnAddUser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			User newUser = new User();
			newUser.setUserName(nameField.getText());
			newUser.setUserSurname(surnameField.getText());
			newUser.setUserExperience(experienceField.getText());
			newUser.setUserInfo(infoArea.getText());
			//Operation.addUser(newUser);
			frame.setVisible(false);
			window.Skills.main(null);
		}
		});

	btnAddUser.setToolTipText("Add new user");
	
	frame.getContentPane().add(btnAddUser);
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