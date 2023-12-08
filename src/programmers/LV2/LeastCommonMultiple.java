package programmers.LV2;

import java.util.Arrays;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = {2, 6, 8, 14};
		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int answer;
		Arrays.sort(arr);
		int max = arr[arr.length - 1];

		for (int i = max; ; i += max) {
			boolean check = true;
			for (int j : arr) {
				if (i % j != 0) {
					check = false;
					break;
				}
			}
			if (check) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
