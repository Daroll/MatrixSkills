package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainWindow {
	
	private JFrame frame;
	private JButton btnNewUser, btnReport, btnClose;
	private JMenu mFile;
	
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
	frame.setSize(300, 300);			//wielkosc okna 
	frame.setLocationRelativeTo(null);	//
	frame.setResizable(true);  		 //okno nie zmienia rozmiarow
	
	frame.getContentPane().setLayout(null); 
	
	//gorne menu
	JMenuBar menuBar = new JMenuBar();
	frame.setJMenuBar(menuBar);
	
	mFile = new JMenu("File");		//File Menu
	menuBar.add(mFile);
	
	//dodwanie nowego pracownika
	
	btnNewUser = new JButton("New User");
	btnNewUser.setBounds(75, 60,150,30);
	btnNewUser.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new NewUser();
			frame.setVisible(false);
			window.NewUser.main(null);
			
		}
	});
	btnNewUser.setToolTipText("Adds New User");
	frame.getContentPane().add(btnNewUser);
	
	//raport wyswietlajacu uzytkownikow + pozniej ze skillami
	
	btnReport = new JButton("Report");
	btnReport.setBounds(75,100,150,30);
	btnReport.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			new NewUser();
			frame.setVisible(false);
			window.UserList.main(null);
		}
	});
	btnReport.setToolTipText("Show Report");
	frame.getContentPane().add(btnReport);
	
	
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

