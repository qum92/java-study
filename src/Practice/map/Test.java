package Practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static final List<Map<String,String>> LIST;
	static {
		LIST = new ArrayList();
		Map<String,String> map = new HashMap<>();
		map.put("이름", "허스키");
		map.put("나이", "5");
		map.put("사는곳", "개집");
		LIST.add(map);
		map = new HashMap<>();
		map.put("이름", "푸들");
		map.put("나이", "2");
		map.put("사는곳", "개집");
		LIST.add(map);
		map = new HashMap<>();
		map.put("이름", "골든리버");
		map.put("나이", "3");
		map.put("사는곳", "개집");
		LIST.add(map);
		
	}
	static Map<String,String> searchDog(String name){
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> d = LIST.get(i);
			if(name.equals(d.get("이름"))) {
				return d;
			}
		}
		return null;
	}
	static List<Map<String,String>> searchDogList(String name){
		List<Map<String,String>> dList = new ArrayList();
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> d = LIST.get(i);
			if(d.get("사는곳").indexOf(name)!=-1) {
				dList.add(d);
			}
		}
		return dList;
	}
	public static void main(String[] args) {
		Map<String,String> d = searchDog("허스키");
		if(d==null) {
			System.out.println("그딴거 없다고");
		}else {
			System.out.println(d);
		}
		List<Map<String,String>> dList = searchDogList("개");
		if(dList.size()==0) {
			System.out.println("그딴거 없다고 개새끼야");
		}else {
			System.out.println(dList);
		}
	}
}
