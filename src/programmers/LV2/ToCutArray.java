package programmers.LV2;

import java.util.Arrays;

// 이차원 배열을 직접 선언하면 안됨

public class ToCutArray {

	public static void main(String[] args) {
		int n = 4;
		long left = 7;
		long right = 14;
		System.out.println(Arrays.toString(solution(n, left, right)));
	}

	public static int[] solution(int n, long left, long right) {
		int[] answer = new int[(int)(right - left + 1)];

		int idx = 0;
		for (long i = left; i <= right; i++) {
			answer[idx++] = (int)(Math.max(i / n, i % n) + 1);
		}
		return answer;
	}
}
