import java.sql.Connection;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionPoolEx {
private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
private static final String DB_UNAME = "root";
private static final String DB_PWD = "root";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(DB_URL);
    config.setUsername(DB_UNAME);
    config.setPassword(DB_PWD);
    config.setMaximumPoolSize(20);
    config.setMinimumIdle(5);
    
    HikariDataSource hd = new HikariDataSource(config);
    Connection con = hd.getConnection();
    String sql ="insert into books values(204,'Jenkins',2800)";
    Statement stmt = con.createStatement();
    stmt.executeUpdate(sql);
    System.out.println("record inserted");
    con.close();
	}

}
