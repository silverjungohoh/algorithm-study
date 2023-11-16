package programmers.LV1;

// 그리디
// 1점 = 최하품, k점 = 최상품

import java.util.Arrays;

public class FruitSeller {

	public static void main(String[] args) {
		int k = 3;
		int m = 4;
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(k, m, score));
	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		for (int i = score.length - m; i >= 0; i -= m) {
			answer += score[i] * m;
		}
		return answer;
	}
}
