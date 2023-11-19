package programmers.LV1;

public class Coke {

	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int n = 20;
		System.out.println(solution(a, b, n));
	}

	public static int solution(int a, int b, int n) {
		int answer = 0;
		int empty = n;
		while (empty >= a) {
			int rest = empty % a;
			int share = empty / a * b;

			answer += share;
			empty = share + rest;

		}
		return answer;
	}
}
