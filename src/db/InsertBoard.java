package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBoard {
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String title = "심심하다아~";
			String content = "다시 갔다아~";
			String sql = "insert into board_info";
			sql +="(bi_num, bi_title, bi_content,\r\n bi_credat, bi_cretim)";
			sql += "values(2,?,?,to_char(sysdate,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			System.out.println(cnt);
			if(cnt==1) {
				System.out.println("정상적으로 1개가 입력 되었습니다.");
			}else if (cnt ==0) {
				System.out.println("입력이 잘못 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
