package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "가만 안둔다.");
		map.put(2,"진짜 죽는다");
		map.put(3,"마지막이다.");
		map.compute(1, (k,v)->(v==null)?"헬로":v.concat("헬로"));

		HashMap<String,Object> cat = new HashMap<>();
		List<HashMap<String,Object>> catList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			HashMap<String,Object> ca = new HashMap<>();
			ca.put("냥이", i+1);
			ca.put("age", ((int)(Math.random()*30)+1));
			catList.add(ca);
		}
		for(HashMap<String,Object> index: catList) {
			System.out.println(index);
		}
//		for(int i=0;i<10;i++) {
//			HashMap<String,Object> ca = catList.get(i);
//			System.out.println(ca);
//		}
	}
}
