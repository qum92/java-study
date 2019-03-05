package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","28");
		map.put("주소","경기도 광명");
		map.put("직업","백수");
		System.out.println(map);
		Set<String> keys = map.keySet();
		System.out.println(keys.size());
		for(String key:keys) {
			System.out.println(key +" : "+map.get(key));
		}
	}
}
