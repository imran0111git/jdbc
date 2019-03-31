
import java.sql.*;
public class test{
	public static void main(String args[]) throws SQLException{
		
		oracle.jdbc.driver.OracleDriver oracleDriver=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(oracleDriver);
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","10");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select * from employee");
		while(rs.next()){
			System.out.println(rs.getString(1));
		
	}
}
}