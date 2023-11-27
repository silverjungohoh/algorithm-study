package programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockTest {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution(answers)));
	}

	public static int[] solution(int[] answers) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

		int cnt1 = getCount(arr1, answers);
		int cnt2 = getCount(arr2, answers);
		int cnt3 = getCount(arr3, answers);

		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, cnt1);
		map.put(2, cnt2);
		map.put(3, cnt3);

		List<Integer> answer = new ArrayList<>();
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort(Comparator.comparing(map::get));

		for (Integer i : keySet) {
			if (map.get(i).equals(map.get(keySet.get(keySet.size() - 1)))) {
				answer.add(i);
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int getCount(int[] arr, int[] answers) {
		int cnt = 0;
		for (int i = 0; i < answers.length; i++) {
			if (i >= arr.length) {
				if (arr[i % arr.length] == answers[i]) {
					cnt++;
				}
			} else {
				if (arr[i] == answers[i]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
