package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import sql.Operation;
import sql.User;





public class NewUser { 

	private JFrame frame;
	private JButton btnMenu, btnNext, btnAddUser;
	
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
	frame.setSize(500,500);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setLayout(null); 


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
	
	btnNext = new JButton("Next");
	btnNext.setBounds(400, 385, 70, 50);
	frame.getContentPane().add(btnNext);
	
// tymczasowe dodanie do
	
	btnAddUser = new JButton("Dodaj");
	btnAddUser.setBounds(200, 385, 70, 50);
	btnAddUser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			User newUser = new User();
			newUser.setUserName(nameField.getText());
			newUser.setUserSurname(surnameField.getText());
			newUser.setUserExperience(experienceField.getText());
			newUser.setUserInfo(infoArea.getText());
			Operation.addUser(newUser);
			frame.setVisible(false);
			window.NewUser.main(null);
		}
		});

	btnAddUser.setToolTipText("Add new user");
	
	frame.getContentPane().add(btnAddUser);
// Powrot do menu
	
	btnMenu = new JButton("Menu");
	btnMenu.setBounds(20, 385, 80, 50);
	btnMenu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			frame.setVisible(false);
			window.MainWindow.main(null);	
			
		}
		});
		frame.getContentPane().add(btnMenu);
		btnMenu.setToolTipText("Go back to Menu");

	
}
}