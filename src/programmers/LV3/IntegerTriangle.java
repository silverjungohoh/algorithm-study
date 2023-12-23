package programmers.LV3;

import java.util.Arrays;

public class IntegerTriangle {

	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(solution(triangle));
	}

	public static int solution(int[][] triangle) {
		for (int i = 1; i < triangle.length; i++) {

			for (int j = 0; j < triangle[i].length; j++) {
				if (j == 0) {
					triangle[i][j] += triangle[i - 1][j];
				} else if (j == i) {
					triangle[i][j] += triangle[i - 1][j - 1];
				} else {
					triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
				}
			}
		}
		int[] arr = triangle[triangle.length - 1];
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}
}
