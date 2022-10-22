package ConnessioneConBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Connessione {
	  Connection conn = null;
	public Connessione(String JDBC_DRIVER, String DB_URL, String USER, String PASS) {  
	    try {
	      Class.forName(JDBC_DRIVER);
	      conn=DriverManager.getConnection(DB_URL, USER, PASS);
	      if(conn != null) {
	    	  System.out.println("Connessione effettuata");
	      }
	     conn.close();
	    } catch (SQLException se) {
	      se.printStackTrace();
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      try {
	       
	        if (conn != null)
	          conn.close();
	      } catch (SQLException se) {
	        se.printStackTrace();
	      }
	    }
	}
}
	    