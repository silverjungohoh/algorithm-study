package programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class NumberPair {

	public static void main(String[] args) {
		String x = "12321";
		String y = "42531";
		System.out.println(solution(x, y));
	}

	public static String solution(String x, String y) {
		int[] arrX = new int[10];
		int[] arrY = new int[10];

		for (int i = 0; i < x.length(); i++) {
			arrX[x.charAt(i) - '0']++;
		}
		for (int i = 0; i < y.length(); i++) {
			arrY[y.charAt(i) - '0']++;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 9; i >= 0; i--) {
			if (arrX[i] > 0 && arrY[i] > 0) {
				int count = Math.min(arrX[i], arrY[i]);
				for (int j = 0; j < count; j++) {
					list.add(i);
				}
			}
		}

		if (list.size() == 0) {
			return "-1";
		} else if (list.get(0) == 0) {
			return "0";
		}

		StringBuilder sb = new StringBuilder();
		for (int n : list) {
			sb.append(n);
		}

		return sb.toString();
	}
}
