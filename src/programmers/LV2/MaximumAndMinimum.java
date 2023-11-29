package programmers.LV2;

import java.util.Arrays;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
	}

	public static String solution(String s) {
		int[] arr = Arrays.stream(s.split(" "))
			.mapToInt(Integer::valueOf).toArray();

		Arrays.sort(arr);
		return arr[0] + " " + arr[arr.length - 1];
	}
}
