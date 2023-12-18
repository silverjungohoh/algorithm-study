package programmers.LV2;

import java.util.ArrayList;
import java.util.List;

public class Network {

	static List<Integer>[] list;
	static boolean[] visited;
	static int count;

	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		System.out.println(solution(n, computers));
	}

	public static int solution(int n, int[][] computers) {

		list = new List[n];
		visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}

		for (int i = 0; i < computers.length; i++) {
			for (int j = 0; j < computers[i].length; j++) {
				if (i != j && computers[i][j] == 1) {
					list[i].add(j);
					list[j].add(i);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}

		return count;
	}

	public static void dfs(int x) {
		visited[x] = true;

		for (int next : list[x]) {
			if (visited[next])
				continue;
			dfs(next);
		}
	}
}
