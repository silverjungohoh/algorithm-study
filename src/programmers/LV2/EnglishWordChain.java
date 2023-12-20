package programmers.LV2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지

public class EnglishWordChain {

	public static void main(String[] args) {
		int n = 3;
		String[] words = {
			"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
		};
		System.out.println(Arrays.toString(solution(n, words)));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = {0, 0};
		Map<String, Integer> map = new HashMap<>();
		map.put(words[0], 1);

		for (int i = 1; i < words.length; i++) {
			char last = words[i - 1].charAt(words[i - 1].length() - 1);
			// 이전 단어의 마지막 문자로 시작하지 않는 단어 or 이전에 등장했던 단어 >> 실패
			if (words[i].charAt(0) != last || map.containsKey(words[i])) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				return answer;
			}
			map.put(words[i], 1);
		}

		return answer;
	}
}
