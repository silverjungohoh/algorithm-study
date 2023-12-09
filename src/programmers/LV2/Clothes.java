package programmers.LV2;

import java.util.HashMap;
import java.util.Map;

public class Clothes {

	public static void main(String[] args) {
		String[][] clothes = {
			{"yellow_hat", "headgear"},
			{"blue_sunglasses", "eye_wear"},
			{"green_turban", "headgear"}
		};
		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<>();
		for (String[] arr : clothes) {
			map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
		}
		for (String s : map.keySet()) {
			answer *= map.get(s) + 1;
		}
		return answer - 1;
	}
}

// 상의 2개, 하의 1개인 경우
// 상의: 1번 상의를 입는 경우, 2번 상의를 입는 경우, 입지 않는 경우
// 하의: 1번 하의를 입는 경우, 입지 않는 경우
// 두 가지 모두 입지 않는 경우는 제외함