package Practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruit {
	
	public final static List<Map<String,String>> LIST;
	static{
		LIST = new ArrayList();
		Map<String,String> map = new HashMap<>();
		map.put("이름", "사과");
		map.put("가격", "2000원");
		map.put("원산지", "청주");
		map.put("품질", "상");
		LIST.add(map);
		map = new HashMap<>();
		map.put("이름", "배");
		map.put("가격", "5000원");
		map.put("원산지", "나주");
		map.put("품질", "상");
		LIST.add(map);
		map = new HashMap<>();
		map.put("이름", "포도");
		map.put("가격", "5000원");
		map.put("원산지", "청주");
		map.put("품질", "상");
		LIST.add(map);		
	}
	public static Map<String,String> searchFruit(String name){
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> f = LIST.get(i);
			if(name.equals(f.get("이름"))) {
				return f;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String,String> fu = searchFruit("배");
		if(fu==null) {
			System.out.println("그딴거 없다고 새끼야");
		}else {
			System.out.println(fu);
		}
	}
}
