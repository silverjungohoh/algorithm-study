package programmers.LV1;

import java.util.Arrays;
import java.util.PriorityQueue;

// 우선순위 큐를 사용

public class HallOfFame {

	public static void main(String[] args) {
		int k = 4;
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int[] answer = solution(k, score);
		System.out.println(Arrays.toString(answer));
	}

	// 우선순위 큐를 사용한 풀이
	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i = 0; i < score.length; i++) {
			pq.offer(score[i]);

			if(pq.size() > k) {
				pq.poll();
			}
			answer[i] = pq.peek();
		}
		return answer;
	}
}
