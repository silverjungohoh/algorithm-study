package programmers.LV2;

import java.util.PriorityQueue;

public class Spicier {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int k = 7;
		System.out.println(solution(scoville, k));
	}

	public static int solution(int[] scoville, int k) {
		int count = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i : scoville) {
			pq.offer(i);
		}

		while (!pq.isEmpty()) {
			if (pq.peek() < k) {
				int a = pq.poll();
				int b;
				if (!pq.isEmpty()) {
					b = pq.poll();
					count++;
					pq.offer(a + 2 * b);
				} else {
					return -1;
				}
			} else {
				pq.poll();
			}
		}
		return count;
	}
}
