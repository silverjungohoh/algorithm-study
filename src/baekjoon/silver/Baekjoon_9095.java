package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9095 {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine());
			count = 0;
			recursive(n, 0);
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}

	public static void recursive(int target, int sum) {
		if (sum > target) {
			return;
		}
		if (sum == target) {
			count++;
			return;
		}

		for (int i = 1; i <= 3; i++) {
			recursive(target, sum + i);
		}
	}
}
