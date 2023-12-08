package programmers.LV2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DiscountEvent {

	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
			"pot", "banana", "apple", "banana"};

		System.out.println(solution(want, number, discount));
	}

	public static int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> wantMap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < want.length; i++) {
			wantMap.put(want[i], number[i]);
			count += number[i];
		}

		for (int i = 0; i <= discount.length - count; i++) {
			Map<String, Integer> map = getMap(discount, i, i + 10);

			boolean check = true;
			for (String s : want) {
				if (!Objects.equals(wantMap.get(s), map.get(s))) {
					check = false;
					break;
				}
			}
			if (check)
				answer++;
		}

		return answer;
	}

	public static Map<String, Integer> getMap(String[] arr, int s, int e) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = s; i < e; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		return map;
	}
}
