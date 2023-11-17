package programmers.LV1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RoughlyMadeKeyboard {

	public static void main(String[] args) {
		String[] keymap = {"BC"};
		String[] targets = {"AC", "BC"};

		int[] answer = solution(keymap, targets);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character, Integer> map = new HashMap<>();

		for (String s : keymap) {
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				if (Objects.isNull(map.get(c))) {
					map.put(c, j + 1);
				} else {
					int cnt = map.get(c);
					map.put(c, Math.min(cnt, j + 1));
				}
			}
		}

		for (int i = 0; i < targets.length; i++) {
			int sum = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				char c = targets[i].charAt(j);
				if (Objects.isNull(map.get(c))) {
					sum = -1;
					break;
				}
				sum += map.get(c);
			}
			answer[i] = sum;
		}
		return answer;
	}
}
