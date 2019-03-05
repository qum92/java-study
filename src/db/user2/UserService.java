package db.user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.user.UserInfoVO;

public class UserService {
	
	public List<UserInfoVO> selectUser(UserInfoVO uivo){
		String sql = "select * from user_info where 1=1";
		if(uivo != null) {
			if(uivo.getUiId()!=null) {
				sql += " and ui_id=?";
			}
			if(uivo.getUiName()!=null) {
				sql += " and ui_name=?";
			}if(uivo.getUiEmail()!=null) {
				sql += " and ui_email=?";
			}
		}
		Connection con = DBCon.getCon();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			int cnt =1;
			if(uivo != null) {
				if(uivo.getUiId()!=null) {
					ps.setString(cnt++, uivo.getUiId());
				}
				if(uivo.getUiName()!=null) {
					ps.setString(cnt++, uivo.getUiName());
				}if(uivo.getUiEmail()!=null) {
					ps.setString(cnt++, uivo.getUiEmail());
				}
			}
			ResultSet rs = ps.executeQuery();
			List<UserInfoVO> uiList = new ArrayList();
			while(rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				uiList.add(ui);
			}
			return uiList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		return null;
	}

}
