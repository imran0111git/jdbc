import java.sql.*;
//to insert
public class insert{
	private PreparedStatement ps;
	public static void main(String args[]) throws SQLException{
		try{
			Class.forName("oracle.jdbc.Driver.OracleDriver");
	
		}
		catch(Exception e){
					
		}
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","10");
		if(con!=null){
			ps=con.prepareStatement("insert into employee values("imran")");
			int result=ps.executeUpdate();
			if(result==0){
				System.out.println("no inserted");
			}
			else{
				System.out.println("inserted");
			}
			
		}
		
		
	}
}