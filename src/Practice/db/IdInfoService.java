package Practice.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class IdInfoService {

	public List<IdInfoVO> selectBoard(){
		String sql = "select * from the id_info";
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<IdInfoVO> idList = new ArrayList();
			while(rs.next()) {
				IdInfoVO id = new IdInfoVO();
				id.setId_num(rs.getInt("id_num"));
				id.setId_name(rs.getString("id_name"));
				id.setId_pwd(rs.getString("id_pwd"));
				id.setId_id(rs.getString("id_id"));
				idList.add(id);
			}
			return idList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return null;
	}
	public static void main(String[] args) {
		IdInfoService ids = new IdInfoService();
		List<IdInfoVO> idList = ids.selectBoard();
		System.out.println(idList);
	}
}
