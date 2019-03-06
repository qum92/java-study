package Practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruit {
	public static final List<Map<String,String>> LIST;
	static {
		LIST = new ArrayList();
		Map<String,String> map = new HashMap();
		map.put("이름", "사과");
		map.put("가격", "2000");
		map.put("원산지", "청주");
		map.put("품질", "상");
		LIST.add(map);
		map = new HashMap();
		map.put("이름", "배");
		map.put("가격", "5000");
		map.put("원산지", "나주");
		map.put("품질", "상");
		LIST.add(map);
		map = new HashMap();
		map.put("이름", "포도");
		map.put("가격", "5000");
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
	public static List<Map<String,String>> searchFruitLIst(String name){
		List<Map<String,String>> fList = new ArrayList();
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> fu = LIST.get(i);
			if(fu.get("품질").indexOf(name)!=-1) {
				fList.add(fu);
			}
		}
		return fList;
	}
	
	public static void main(String [] args) {
		Map<String,String> f = searchFruit(("사과"));
		if(f==null) {
			System.out.println("그런거 없어");
		}else {
			System.out.println(f);
		}
		List<Map<String,String>> fList = searchFruitLIst("상");
		if(fList.size()==0) {
			System.out.println("그런거 없어");
		}else {
			System.out.println(fList);
		}
	}
}
