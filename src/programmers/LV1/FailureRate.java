package programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailureRate {

	public static void main(String[] args) {
		int n = 5;
		int[] stages = {1, 1, 1, 2, 3, 4};
		System.out.println(Arrays.toString(solution(n, stages)));
	}

	public static int[] solution(int n, int[] stages) {
		int[] answer = new int[n];
		int[] failCounts = new int[n + 2]; // 각 stage 머물러 있는 사람 수
		for (int s : stages) {
			failCounts[s]++;
		}

		int total = stages.length;
		List<Stage> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (failCounts[i] == 0) { // stage 도달한 유저가 없는 경우
				list.add(new Stage(i, 0.0));
				continue;
			}
			double failure = failCounts[i] / (double)total;
			total -= failCounts[i];
			list.add(new Stage(i, failure));
		}
		list.sort(((o1, o2) -> Double.compare(o2.rate, o1.rate)));

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).idx;
		}
		return answer;
	}

	static class Stage {
		int idx;
		double rate;

		public Stage(int idx, double rate) {
			this.idx = idx;
			this.rate = rate;
		}
	}
}
