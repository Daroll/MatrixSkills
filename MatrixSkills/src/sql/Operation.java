package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Operation {
	
	static String host = "jdbc:sqlserver://localhost:1433;databaseName=SM";
    static String user = "sa";
    static String password = "bartuS15";
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
    


public static void addUser (User newUser) 
{
	try {
			
		Statement stmt = connectBase();
		stmt.execute("INSERT INTO [User] VALUES ('"+newUser.UserName+"', '"+newUser.UserSurname+"', "+newUser.UserExperience+", '"+newUser.UserInfo+"')");
			} catch (SQLException e) {
		System.out.println("This user exist" +e);
}
}

public static String[] showUser() 
{
	String [] UserString = new String[10];
	try {
		
		Statement stmt = connectBase();
		ResultSet rs = stmt.executeQuery("SELECT * FROM [User]");
		int i=0;
		
		
		while(rs.next()) 
		{
			UserString[i] = rs.getString(1)+"    "+ rs.getString(2)+ "    " + rs.getString(3)+ "    " + rs.getString(4)+"    "+ rs.getString(5);
			i++;
        }
		 rs.close();
         stmt.close();
			} catch (SQLException e) {
		System.out.println("SQL ERROR " +e);
			}
	return UserString;
}


public static String[][] getUser() 
{
	int z= countRecords("[User]");
	String [][] User = new String[z][4];
	try {
		
		Statement stmt = connectBase();
		ResultSet rs = stmt.executeQuery("SELECT * FROM [USER]");
		int i=0;
					
		while(rs.next()) 
		{
			
			User[i][0] = rs.getString(2);
			User[i][1] = rs.getString(3); 
			User[i][2] = rs.getString(4);
			User[i][3] = rs.getString(5);

			i++;
        }
		 rs.close();
         stmt.close();
			} catch (SQLException e) {
		System.out.println("SQL ERROR " +e);
			}
	return User;
}

public static int countRecords(String nametable) {
	int i=0;
	try {
			Statement stmt = connectBase();
			ResultSet rs = stmt.executeQuery("SELECT COUNT (*) FROM "+ nametable);
			
			while(rs.next()) {
			   i = rs.getInt(1);
			}
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
		System.out.println("Count Records in tabe"+nametable+e);
			}
	return i;
}

}
