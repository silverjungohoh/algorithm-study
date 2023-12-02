package programmers.LV2;

// 재귀 or Dynamic Programming
//  F(n) = F(n-1) + F(n-2)

public class FibonacciNumber {

	static int[] arr;

	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	public static int solution(int n) {
		arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
		}
		return arr[n] % 1234567;
	}
}

