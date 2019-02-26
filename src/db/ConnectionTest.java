package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@192.168.0.2:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "insert into board";
			ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getObject("board"));
			}		
			System.out.println("연결 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결이 실패 하였습니다. 비밀번호를 확인 하여 주세요.");
		}
	}
}