package programmers.LV2;

// 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값

import java.util.Collections;
import java.util.PriorityQueue;

public class OvertimeFigure {

	public static void main(String[] args) {
		int n = 4;
		int[] works = {4, 3, 3};
		System.out.println(solution(n, works));
	}

	public static long solution(int n, int[] works) {
		long answer = 0;
		long total = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : works) {
			pq.offer(i);
			total += i;
		}

		if (total <= n) // 야근 필요 없는 경우
			return 0;

		while (n != 0) {
			if (pq.isEmpty())
				break;
			int tmp = pq.poll();
			pq.offer(tmp - 1);
			n--;
		}

		while (!pq.isEmpty()) {
			answer += Math.pow(pq.poll(), 2);
		}

		return answer;
	}
}
