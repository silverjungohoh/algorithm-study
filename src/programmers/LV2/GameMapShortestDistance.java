package programmers.LV2;

// bfs or dfs

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {

	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) {
		int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
		System.out.println(solution(maps));
	}

	public static int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;
		arr = new int[n][m];
		visited = new boolean[n][m];
		return bfs(maps, 0, 0);
	}

	public static int bfs(int[][] maps, int x, int y) {
		arr[0][0] = 1;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(x, y));
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			Node now = queue.poll();
			for (int i = 0; i < 4; i++) {
				int xx = now.x + dx[i];
				int yy = now.y + dy[i];
				if (check(xx, yy) && maps[xx][yy] != 0) {
					arr[xx][yy] = arr[now.x][now.y] + 1;
					visited[xx][yy] = true;
					queue.offer(new Node(xx, yy));
				}
			}
		}
		return arr[n - 1][m - 1] == 0 ? -1 : arr[n - 1][m - 1];
	}

	public static boolean check(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m && !visited[x][y];
	}

	static class Node {
		int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
