package programmers.LV1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		System.out.println(solution(10));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if(checkPrime(i)) {
				answer++;
			}
		}
		return answer;
	}

	public static boolean checkPrime(int x) {
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
