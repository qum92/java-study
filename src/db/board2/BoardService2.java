package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService2 {

	public List<BoardInfoVO> selectboard() {
		String sql = "select * from board_info";
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> biList = new ArrayList();
			while(rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_Credat"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiIsactive(rs.getString("bi_isactive"));
				biList.add(bi);
			}
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return null;
	}	
	public static void main(String [] args) {
		BoardService2 bs = new BoardService2();
		List<BoardInfoVO> biList = bs.selectboard();
		System.out.println(biList);
	}
}