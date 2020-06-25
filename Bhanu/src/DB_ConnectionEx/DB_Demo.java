//This Program we are unable to Execute because we required DB Cloud, So just for our knowledge 

package DB_ConnectionEx;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DB_Demo {	
		
		public static int[] getDB_Data(String sqlQuery) {
			
			Connection conn = null;
			Statement stmt = null;
			int[] arr = new int[2];

			   try{
			      // Open a connection
			      System.out.println("Connecting  to a selected database...");
			      Class.forName("com.mysql.jdbc.Driver");  
			      conn = DriverManager.getConnection("jdbc:mysql://15.206.92.87:3306/ors_orbitscience","ors_admin1","admin@111"); 
	//conn = DriverManager.getConnection("jdbc:mysql://localhost/EMP","root","");		      
			      System.out.println("Connected database successfully...");
			      
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			     
			      ResultSet rs = stmt.executeQuery(sqlQuery);		      
			      
			     int i=0;
			     while(rs.next()){		         
			    	 arr[i]  = rs.getInt("us_id");
			    	 i++;		       
			     }		 
			      
			     rs.close();
			   }
			   
			   catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }
			   catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }
			   
			   return arr;		
		}
		
		
		//==========================================

		public static void main(String[] args) {
			
			String query = "SELECT * from user_profile";
			int[] data = getDB_Data(query);
			System.out.println(data[0]);
			System.out.println(data[1]);		
		}
	}

