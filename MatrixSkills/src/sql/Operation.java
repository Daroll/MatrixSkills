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
}