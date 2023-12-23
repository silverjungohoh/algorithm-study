package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_13699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}

	public static long solution(int n) {
		long[] arr = new long[36];
		arr[0] = 1;

		for (int i = 1; i < arr.length; i++) {
			for (int idx = 0; idx <= i - 1; idx++) {
				arr[i] += arr[idx] * arr[i - 1 - idx];
			}
		}
		return arr[n];
	}
}
