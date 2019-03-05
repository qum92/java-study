package Practice.db;

import java.util.List;

public class Execute {
	
	public static void main(String[] args) {
		IdInfoService ids = new IdInfoService();
		List<IdInfoVO> idList = ids.selectBoard();
		System.out.println(idList);
	}
}