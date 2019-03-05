package db.user2;

import java.util.List;

import db.user.UserInfoVO;

public class Execute {

	public static void main(String[] args) {
		UserService us = new UserService();
		UserInfoVO uivo = new UserInfoVO();
		uivo.setUiId("ksmsm12");
		uivo.setUiName("김선민");
		uivo.setUiEmail("sunmin116@naver.com");
		List<UserInfoVO> uiList = us.selectUser(uivo);
		for(UserInfoVO index:uiList) {
			System.out.println(index);
		}
	}
}
