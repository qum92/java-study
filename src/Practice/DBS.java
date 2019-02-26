package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBS {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
			System.out.println(rs.getObject("num"));
			List<HashMap<Object,Object>> metaList = new ArrayList<>();
			for(int i=0;rs.next();i++) {
			HashMap<Object,Object> ds = new HashMap<>();
			ds.put("title", rs.getString("title"));
			metaList.add(ds);
			System.out.println(metaList);
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
