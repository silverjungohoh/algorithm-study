package programmers.LV2;

import java.util.Arrays;

public class MakeMinimumValue {

	public static void main(String[] args) {
		int[] a = {1, 4, 2};
		int[] b = {5, 4, 4};
		System.out.println(solution(a, b));
	}

	public static int solution(int[] A, int[] B) {
		int answer = 0;
		// A > 작은 수부터, B > 큰 수부터
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];
		}
		return answer;
	}
}
