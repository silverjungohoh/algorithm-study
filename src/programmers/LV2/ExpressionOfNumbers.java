package programmers.LV2;

// a부터 b 까지의 합 = (a + b) * (b  - a + 1) / 2

public class ExpressionOfNumbers {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}

	public static int solution(int num) {
		int answer = 0;
		for (int a = 1; a <= num; a++) {
			for (int b = a; b <= num; b++) {
				int tmp = ((a + b) * (b - a + 1)) / 2;
				if (tmp == num) {
					answer++;
				} else if (tmp > num) {
					break;
				}
			}
		}
		return answer;
	}
}
