package programmers.LV1;

public class RemainderIsOne {

	public static void main(String[] args) {
		System.out.println(solution(12));
	}

	public static int solution(int n) {
		int answer = 1;
		while (n % answer != 1) {
			answer++;
		}
		return answer;
	}
}
