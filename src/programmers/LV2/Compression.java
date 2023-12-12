package programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {

	public static void main(String[] args) {
		String msg = "TOBEORNOTTOBEORTOBEORNOT";
		System.out.println(Arrays.toString(solution(msg)));
	}

	public static int[] solution(String msg) {
		List<Integer> result = new ArrayList<>();

		int id = 1;
		Map<String, Integer> map = new HashMap<>();
		for (char i = 'A'; i <= 'Z'; i++) {
			map.put(String.valueOf(i), id++);
		}

		int idx = 0;
		while (idx < msg.length()) {
			StringBuilder sb = new StringBuilder();
			while (idx < msg.length()) {
				if (!map.containsKey(sb.toString() + msg.charAt(idx))) {
					break;
				} else {
					sb.append(msg.charAt(idx));
				}
				idx++;
			}
			result.add(map.get(sb.toString()));
			if (idx < msg.length()) {
				map.put(sb.toString() + msg.charAt(idx), id++);
			}
		}

		return result.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}
}
