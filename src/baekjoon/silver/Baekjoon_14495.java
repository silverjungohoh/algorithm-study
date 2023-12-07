package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// f(n) = f(n-1) + f(n-3)

public class Baekjoon_14495 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long[] arr = new long[117];
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;

		for (int i = 4; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 3];
		}
		System.out.println(arr[n]);
	}
}
