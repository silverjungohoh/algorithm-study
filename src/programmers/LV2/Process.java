package programmers.LV2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Process {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		PriorityQueue<Item> pq = new PriorityQueue<>((o1, o2) -> o2.pri - o1.pri);
		Queue<Item> queue = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) {
			Item item = new Item(i, priorities[i]);
			pq.offer(item);
			queue.offer(item);
		}
		int tmp = 0;
		while (!queue.isEmpty()) {
			Item it = queue.poll();
			if (!pq.isEmpty() && it.pri == pq.peek().pri) {
				tmp++;
				pq.poll();
				if (it.idx == location) {
					answer = tmp;
				}
			} else if (!pq.isEmpty() && it.pri < pq.peek().pri) {
				queue.offer(it);
			}
		}

		return answer;
	}

	static class Item {
		int idx;
		int pri;

		public Item(int idx, int pri) {
			this.idx = idx;
			this.pri = pri;
		}
	}
}

//  1. 실행 대기 큐에서 대기중인 프로세스 하나를 꺼냅니다.
// 	2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
// 	3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
// 	3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.