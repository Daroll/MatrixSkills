package window;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AboutWindow extends JFrame{
 

 private static final long serialVersionUID = -6044030934883451466L;
 private JFrame frame;
 private JButton btnClose;
 private JLabel label;
 private JLabel about;
 
 public static void main(String[] args) {
   EventQueue.invokeLater(new Runnable() {
     public void run() {
      try {
       AboutWindow window = new AboutWindow();
       window.frame.setVisible(true);
       } catch (Exception e) {
        e.printStackTrace();}
     }
   });
  }
 
 public AboutWindow() {
  initialize();
 }
 
 private void initialize() {
  frame = new JFrame("About ...");
  frame.setSize(300,300);
  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  frame.setLocationRelativeTo(null);
  frame.getContentPane().setLayout(null); 
  frame.setResizable(false);
  
  
//ikona
  frame.setIconImage(new javax.swing.ImageIcon(getClass().getResource("Siimage.png")).getImage());

  label = new JLabel("");
  Image img = new ImageIcon(this.getClass().getResource("Siimage.png")).getImage();
  label.setIcon(new ImageIcon(img));
  
  label.setBounds(70, 10, 140, 100);
  frame.getContentPane().add(label);
  
  about = new JLabel("Sii Skill Matrix ver. 0.1 \n\n");
  about.setBounds(10, 130, 260, 80);
  about.setBackground(null);
  frame.getContentPane().add(about);
  
  btnClose = new JButton("Close");
  btnClose.setBounds(100,210,100,30);
  btnClose.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent arg0) {
   frame.setVisible(false);
   window.MainWindow.main(null);
  }
  });
  btnClose.setToolTipText("Close window  'About ...'");
  frame.getContentPane().add(btnClose);
  
 }
}