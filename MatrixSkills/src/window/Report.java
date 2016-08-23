package window;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;





public class Report { 

	private JFrame frame;
	private JButton btnCancel;
	
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
	frame.setIconImage(new javax.swing.ImageIcon(getClass().getResource("Siimage.png")).getImage());
	
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