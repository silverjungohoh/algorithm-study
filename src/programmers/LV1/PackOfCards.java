package programmers.LV1;

import java.util.LinkedList;
import java.util.Queue;

public class PackOfCards {

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		System.out.println(solution(cards1, cards2, goal));
		System.out.println(solutionWithQueue(cards1, cards2, goal));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int idx1 = 0;
		int idx2 = 0;

		for (String s : goal) {
			if (idx1 < cards1.length && s.equals(cards1[idx1])) {
				idx1++;
			} else if (idx2 < cards2.length && s.equals(cards2[idx2])) {
				idx2++;
			} else {
				return "No";
			}
		}
		return answer;
	}

	public static String solutionWithQueue(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";

		Queue<String> queue1 = new LinkedList<>();
		Queue<String> queue2 = new LinkedList<>();
		Queue<String> goalQueue = new LinkedList<>();

		for(String s : cards1) {
			queue1.offer(s);
		}

		for(String s : cards2) {
			queue2.offer(s);
		}

		for(String s : goal) {
			goalQueue.offer(s);
		}

		while(!goalQueue.isEmpty()) {
			String word = goalQueue.poll();
			if(word.equals(queue1.peek())) {
				queue1.poll();
			} else if (word.equals(queue2.peek())) {
				queue2.poll();
			} else {
				return "No";
			}
		}
		return answer;
	}
}
