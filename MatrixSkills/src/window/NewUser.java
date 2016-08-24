package window;

import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import sql.User;





public class NewUser { 

	private JFrame frame;
	private JButton btnCancel, btnAddUser;
	private JMenu mFile, mAbout;
	private JScrollPane jScrollPane1;
	
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
	    mntmReport.setAccelerator(KeyStroke.getKeyStroke(  	// skr�t klawiszowy
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
			mntmClose.setAccelerator(KeyStroke.getKeyStroke(	// skr�t klawiszowy
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
	        mntmAbout.setAccelerator(KeyStroke.getKeyStroke(	// skr�t klawiszowy
			KeyEvent.VK_A, ActionEvent.CTRL_MASK));
	        mAbout.add(mntmAbout);
	

//DODAWANIE DANYCH

//Pole imie

	JLabel name = new JLabel("Name:");
	name.setBounds(55, 50, 70, 20);
	name.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(name);
	
	final JTextField nameField = new JTextField("");
	nameField.setBounds(120, 40, 350, 40);
	nameField.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(nameField);
	
//Naziwsko
	
	JLabel surname = new JLabel ("Surname:");
	surname.setBounds(30, 110, 100, 20);
	surname.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(surname);
	
	final JTextField surnameField = new JTextField ("");
	surnameField.setBounds(120, 100, 350, 40);
	surnameField.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(surnameField);
	
// Sta� - nazewnictwo do zmiany
	
	JLabel experience = new JLabel ("Experience:");
	experience.setBounds(15, 170, 100, 20);
	experience.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(experience);
	
	final JTextField experienceField = new JTextField ("");
	experienceField.setBounds(120, 160, 50, 40);
	experienceField.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(experienceField);
	
// Pole na inf
	
	JLabel info = new JLabel ("Additional");
	info.setBounds(15, 220, 140, 20);
	info.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(info);
	
	JLabel info2 = new JLabel ("Information");
	info2.setBounds(15, 240, 140, 20);
	info2.setFont(new Font("Calibri", Font.PLAIN, 20));
	frame.getContentPane().add(info2);
	
	final JTextArea infoArea = new JTextArea ("");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    infoArea.setColumns(20);
    infoArea.setLineWrap(true);
    infoArea.setRows(5);
	infoArea.setWrapStyleWord(true);
	  jScrollPane1 = new JScrollPane(infoArea);
	  
	infoArea.setBounds(120, 210, 350, 130);
	infoArea.setFont(new Font("Calibri", Font.PLAIN, 20));

	frame.getContentPane().add(infoArea);
	
	
// Kolejna strona
	
	
	btnAddUser = new JButton("Next");
	btnAddUser.setBounds(480, 360, 80, 50);
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
	btnCancel.setBounds(20, 360, 80, 50);
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			window.MainWindow.main(null);	
			
		}
		});
		frame.getContentPane().add(btnCancel);
		btnCancel.setToolTipText("Go back to Menu");

	
}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}