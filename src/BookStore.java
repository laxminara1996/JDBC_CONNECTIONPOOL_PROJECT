import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookStore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Connection con = ConnectionFactory.getDBConnection();
       Statement stmt =  con.createStatement();
       ResultSet rs = stmt.executeQuery("select * from books");
       while(rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getInt(3));
       }
       rs.close();
       stmt.close();
       con.close();
	}

}
