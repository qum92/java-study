package Practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameCD {

	public final static List<Map<String, String>> GAMELIST;

	static {
		GAMELIST = new ArrayList<>();
		Map<String, String> game = new HashMap<>();
		game.put("이름", "어둠의전설");
		game.put("개발년도", "1998");
		game.put("개발회사", "넥슨");
		GAMELIST.add(game);
		game = new HashMap<>();
		game.put("이름", "바람의나라");
		game.put("개발년도", "1998");
		game.put("개발회사", "넥슨");
		GAMELIST.add(game);
		game = new HashMap<>();
		game.put("이름", "일렌시아");
		game.put("개발년도", "2004");
		game.put("개발회사", "넥슨");
		GAMELIST.add(game);
		game = new HashMap<>();
		game.put("이름", "일렌시아1");
		game.put("개발년도", "2004");
		game.put("개발회사", "넥슨");
		GAMELIST.add(game);
		game = new HashMap<>();
		game.put("이름", "일렌시아2");
		game.put("개발년도", "2004");
		game.put("개발회사", "넥슨");
		GAMELIST.add(game);
	}

	public static Map<String, String> searchGame(String name) {
		for (int i = 0; i < GAMELIST.size(); i++) {
			Map<String, String> game = GAMELIST.get(i);
			if (name.equals(game.get("이름"))) {
				return game;
			}
		}
		return null;
	}

	public static List<Map<String, String>> searchGameList(String name) {
		List<Map<String, String>> gameList = new ArrayList<>();
		for (int i = 0; i < GAMELIST.size(); i++) {
			Map<String, String> game = GAMELIST.get(i);
			if (game.get("이름").indexOf(name) != -1) {
				gameList.add(game);
			}
		}
		return gameList;
	}

	public static void main(String[] args) {
		Map<String, String> game = searchGame("어둠의전설");
		if (game == null) {
			System.out.println("그딴거 없어");
		} else {
			System.out.println(game);
		}
		List<Map<String, String>> gameList = searchGameList("일렌");
		if (gameList.size() == 0) {
			System.out.println("그딴거 없다고");
		} else {
			System.out.println(gameList);
		}

	}
}