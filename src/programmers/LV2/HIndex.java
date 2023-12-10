package programmers.LV2;

import java.util.Arrays;

// n편 중, h번 이상 인용된 논문이 h편 이상

public class HIndex {

	public static void main(String[] args) {
		int[] arr = {3, 0, 6, 1, 5};
		System.out.println(solution(arr));
	}

	public static int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			// 인용된 논문의 수
			int cnt = citations.length - i;
			if (citations[i] >= cnt) {
				answer = cnt;
				break;
			}
		}
		return answer;
	}
}

// 0번 이상 인용된 논문 = 5편
// 1번 이상 인용된 논문 = 4편
// 3번 이상 인용된 논문 = 3편
// 5번 이상 인용된 논문 = 2편
// 6번 이상 인용된 논문 = 1편