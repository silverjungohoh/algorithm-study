package programmers.LV3;

import java.util.Arrays;

public class TheBestSet {

	public static void main(String[] args) {
		int n = 3;
		int s = 8;
		System.out.println(Arrays.toString(solution(n, s)));
	}

	public static int[] solution(int n, int s) {
		int[] arr;
		if (n > s) {
			return new int[] {-1};
		} else {
			int r = s % n;
			arr = new int[n];
			Arrays.fill(arr, s / n);
			if (r != 0) {
				for (int i = arr.length - 1; i >= 0; i--) {
					arr[i] += 1;
					r--;
					if (r == 0)
						break;
				}
			}
			return arr;
		}
	}
}
