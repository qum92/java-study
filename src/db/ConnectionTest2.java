package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url , id, pwd);
			Statement stmt = con.createStatement();
			String  sql = "select BI_NUM, BI_TITLE, BI_CONTENT, BI_CREDAT,"
					+" BI_CRETIM, BI_CNT, BI_ISACTIVE from board_info";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowlist = new ArrayList<>();
			while(rs.next()) {
				HashMap<String,String> row = new HashMap<>();
				row.put("biNum", rs.getString("BI_TITLE"));
				row.put("biTitle", rs.getString("BI_NUM"));
				row.put("biContent", rs.getString("BI_CONTENT"));
				row.put("biCredat", rs.getString("BI_CREDAT"));
				row.put("biCretim", rs.getString("BI_CRETIM"));
				row.put("biCnt", rs.getString("BI_CNT"));
				row.put("biIsactive", rs.getString("BI_ISACTIVE"));
				rowlist.add(row);				
			}
			for(int i=0;i<rowlist.size();i++) {
				System.out.println(rowlist.get(i));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
