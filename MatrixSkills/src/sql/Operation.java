package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import window.NewUser;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

import java.sql.ResultSet;

public class Operation {
	
	static String host = "jdbc:sqlserver://localhost:1433;databaseName=SM";
    static String user = "Tester";
    static String password = "Kafar15";
    static Connection con = null;
    
    
    public static Statement connectBase()
    {
    	try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MsSQL JDBC Driver?");
			e.printStackTrace();
		}
		try{
            con = DriverManager.getConnection(host,user,password);  
            Statement stmt = con.createStatement();
            return stmt;
                     
        } catch(SQLException err){
            System.out.println(err.getMessage());
        }
		return null; }
    


public static void addNewUser(NewUser newNewUser) 
{
	try {
			
		Statement stmt = connectBase();
			stmt.executeUpdate("INSERT NewUser VALUES ('"+NewUser.NameOwner+"' , '"+NewUser.AddressOwner+"', '"+NewUser.InfoOwner+"')");
			} catch (SQLException e) {
		System.out.println("This owner exist" +e);
}
}
}