package programmers.LV1;

public class KnightWeapon {

	public static void main(String[] args) {
		System.out.println(solution(10, 3, 2));
	}

	public static int solution(int number, int limit, int power) {
		int answer = 0;
		int[] arr = new int[number + 1];

		for (int i = 1; i <= number; i++) {
			arr[i] = getNumberOfDivisor(i);
		}

		for (int i = 1; i <= number; i++) {
			if (arr[i] > limit) {
				answer += power;
			} else {
				answer += arr[i];
			}
		}

		return answer;
	}

	// 약수의 개수 구하기
	private static int getNumberOfDivisor(int n) {
		int cnt = 0;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n)
				cnt++;
			else if (n % i == 0)
				cnt += 2;
		}
		return cnt;
	}
}
