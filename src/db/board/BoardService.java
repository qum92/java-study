package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("제목");
		while(rs.next()) {
			System.out.println(rs.getString("bi_title"));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title, bi_content, bi_credat, bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt== 1) {
				System.out.println("정상적으로 처리 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBCon.close();
		}
	}
	public void deleteBoard(String rowNum) {
		String sql = "delete from board_info where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, rowNum);
			int cnt = ps.executeUpdate();
			if(cnt== 1) {
				System.out.println("정상적으로 처리 되었습니다.");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void updateBoard(int wh,String title) {
		String sql = "update board_info \r\n"+
				"set bi_title=?  \r\n"+
				"where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setInt(2, wh);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 업데이트 되었습니다.");
			}else {
				System.out.println("업데이트에 실패 하셨습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	public void updateBoard1(int wh,String content) {
		String sql = "update board_info \r\n"+
				"set bi_content=? \r\n"+
				"where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, content);
			ps.setInt(2, wh);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 업데이트 되었습니다.");
			}else {
				System.out.println("업데이트에 실패 하셨습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void updateBoard(int wh,String title, String content) {
		String sql = "update board_info \r\n"+
				"set bi_title=?,  \r\n"+
				"bi_content=? \r\n"+
				"where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, wh);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 업데이트 되었습니다.");
			}else {
				System.out.println("업데이트에 실패 하셨습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
}