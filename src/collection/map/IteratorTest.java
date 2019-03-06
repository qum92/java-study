package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("이름","채희주");
		map.put("나이", "28");
		map.put("주소", "광명");
		map.put("특기", "게임");
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : "+ key + " Value: " + map.get(key));
		}
	}
}
