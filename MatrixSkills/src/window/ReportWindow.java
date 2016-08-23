package window;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import sql.Operation;





public class ReportWindow { 
	
 private JFrame frame;
 private JButton btnCancel;
	JList<String> list;
	Container cp;
 
 //uruchomienie
 
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
    public void run() {
     try {
      ReportWindow window = new ReportWindow();
      window.frame.setVisible(true);
      } catch (Exception e) {
       e.printStackTrace();}
    }
  });
 }

 public ReportWindow(){

 initialize(); 
}

//inicjalizacja ramki

 public void initialize() {
 frame = new JFrame("Report");
 frame.setSize(500,500);
 frame.setLocationRelativeTo(null);
 frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 frame.setLayout(null); 

 
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