package programmers.LV2;

// 한 번에 1칸 or 2칸 이동 가능
// 피보나치 수열 >> DP 사용
// (a + b) % n = (a % n + b % n) % n;

public class LongJump {

	public static void main(String[] args) {
		System.out.println(solution(4));
	}

	public static long solution(int n) {
		long[] arr = new long[2001];
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < 2001; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
		}
		return arr[n];
	}
}