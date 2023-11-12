package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {
			{"may", "kein", "kain", "radi"},
			{"may", "kein", "brin", "deny"},
			{"kon", "kain", "may", "coni"}
		};
		int[] answer = solution(name, yearning, photo);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {
				sum += map.getOrDefault(photo[i][j], 0);
			}
			answer[i] = sum;
		}
		return answer;
	}
}
