package window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;

import sql.Operation;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserList extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnMenu;



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserList frame = new UserList();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					frame.setSize(1500, 1000);
					frame.setLocationRelativeTo(null);						//ustawienie na środku strony
					frame.getContentPane().setLayout(null);
					frame.setResizable(false);
					//ikona
					frame.setIconImage(new javax.swing.ImageIcon(getClass().getResource("Siimage.png")).getImage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Tworzenie tabeli
	
	 */
	public UserList() throws Exception {
		
		setTitle("Users List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		setBounds(100, 100, 1200, 1400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		String [][] users;
		users = Operation.getUser();
		Object[][] dane = users;
		String[] column_name ={"User Name", "User Surname", "Experience", "info"};
		table = new JTable(dane,column_name);
		table.setFont(new Font("Verdana", Font.PLAIN, 12));
		table.setCellSelectionEnabled(true);
		table.setName("Owners List");
		table.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), null));
		table.setColumnSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane(table);
	    getContentPane().add(scrollPane);

	}
}
