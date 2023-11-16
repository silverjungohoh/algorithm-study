package programmers.LV1;

// 달리기 경주

import java.util.HashMap;
import java.util.Map;

public class RunningRace {

	public static void main(String[] args) {
		String [] players = {"mumu", "soe", "poe", "kai", "mine"};
		String [] callings = {"kai", "kai", "mine", "mine"};

		solution(players, callings);
	}

	public static String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		Map<String, Integer> playerMap = new HashMap<>();
		for(int i = 0; i<players.length; i++) {
			playerMap.put(players[i], i);
		}

		for (String calling : callings) {
			int rank = playerMap.get(calling);// 현재 호명된 사람의 순위
			String name = players[rank - 1]; // 현재 호명된 사람 앞에 있는 사람의 이름

			players[rank-1] = calling;
			players[rank] = name;
			playerMap.put(calling, rank - 1);
			playerMap.put(name, rank);
		}

		for (String player : players) {
			answer[playerMap.get(player)] = player;
		}
		return answer;
	}
}
