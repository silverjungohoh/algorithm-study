package programmers.LV1;

import java.util.Arrays;

public class WalkInPark {

	public static void main(String[] args) {
		String[] park = {"SOO", "OXX", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		int[] ans = solution(park, routes);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] solution(String[] park, String[] routes) {
		int[][] grid = new int[park.length][park[0].length()];

		int sx = 0;
		int sy = 0;

		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length(); j++) {
				char c = park[i].charAt(j);
				if (c == 'S') {
					sx = i;
					sy = j;
				} else if (c == 'X') {
					grid[i][j] = -1;
				}
			}
		}

		for (String route : routes) {
			String dir = route.split(" ")[0];
			int len = Integer.parseInt(route.split(" ")[1]);

			int tx = sx;
			int ty = sy;

			for (int i = 0; i < len; i++) {
				switch (dir) {
					case "N":
						tx--;
						break;
					case "S":
						tx++;
						break;
					case "W":
						ty--;
						break;
					default:
						ty++;
						break;
				}
				if (tx >= 0 && tx < grid.length && ty >= 0 && ty < grid[0].length) {
					if (grid[tx][ty] == -1)
						break;
					if (i == len - 1) {
						sx = tx;
						sy = ty;
					}
				}
			}
		}
		return new int[] {sx, sy};
	}
}
