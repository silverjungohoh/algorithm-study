package programmers;

import java.util.HashMap;
import java.util.Map;

public class ClosestSameLetter {

	public static void main(String[] args) {
		String s = "foobar";
		solution(s);
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			answer[i] = i - map.getOrDefault(c, i + 1);
			map.put(c, i);
		}
		return answer;
	}
}
