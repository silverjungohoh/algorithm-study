package programmers.LV2;

// 귤을 크기별로 분류하였을 때 서로 다른 종류의 수를 최소화
// 그리디?

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChooseTangerine {

	public static void main(String[] args) {
		int k = 2;
		int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};
		System.out.println(solution(k, tangerine));
	}

	public static int solution(int k, int[] tangerine) {
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int t : tangerine) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((t1, t2) -> map.get(t2).compareTo(map.get(t1)));

		int count = 0;
		for (Integer i : keySet) {
			count += map.get(i);
			ans++;
			if (count >= k) {
				break;
			}
		}
		return ans;
	}
}
