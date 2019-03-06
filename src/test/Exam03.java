package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exam03 {
	static final List<Map<String, String>> LIST;
	static {
		LIST = new ArrayList<>();
		Map<String, String> game1 = new HashMap<>();
		game1.put("이름", "슈퍼마리오");
		game1.put("가격", "30000");
		LIST.add(game1);
		game1 = new HashMap<>();
		game1.put("이름", "스트리트파이터2");
		game1.put("가격", "40000");
		LIST.add(game1);
		game1 = new HashMap<>();
		game1.put("이름", "스트리트파이터3");
		game1.put("가격", "50000");
		LIST.add(game1);
	}

	public static Map<String, String> searchGame(String name) {
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i);
			if (name.equals(game.get("이름"))) {
				return game;
			}
		}
		return null;
	}

	public static List<Map<String, String>> searchGameList(String name) {
		List<Map<String, String>> gameList = new ArrayList<>();
		for (int i = 0; i < LIST.size(); i++) {
			Map<String, String> game = LIST.get(i);
			if (game.get("이름").indexOf(name) != -1) {
				gameList.add(game);
			}
		}
		return gameList;
	}

	public static void main(String[] args) {
		Map<String, String> game = searchGame("스트리트파이터2");
		if (game == null) {
			System.out.println("그딴거 없어");
		} else {
			System.out.println(game);
		}

		List<Map<String, String>> gameList = searchGameList("스트리트파이터");
		if (gameList.size() == 0) {
			System.out.println("넌 맨날 없는 것만 찾더라");
		} else {
			System.out.println(gameList);
		}
	}
}
