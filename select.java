import java.sql.*;

public class select{
 public static void main(String args[]) throws SQLException{
	oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(driver);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","10");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student");
	while(rs.next()){
	System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));
	}
	rs.close();
	st.close();
	con.close();
}
}