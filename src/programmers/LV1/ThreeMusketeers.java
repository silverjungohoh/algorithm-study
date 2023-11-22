package programmers.LV1;

// 중복 X, 순서 X

public class ThreeMusketeers {

	static int cnt;
	static boolean[] visited;

	public static void main(String[] args) {
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		System.out.println(solution(number));
	}

	public static int solution(int[] number) {
		cnt = 0;
		visited = new boolean[number.length];
		recursive(0, 0, number, 0);
		return cnt;
	}

	public static void recursive(int idx, int sum, int[] number, int start) {
		if (idx == 3) {
			if (sum == 0) {
				cnt++;
			}
		} else {

			for (int i = start; i < number.length; i++) {
				if (visited[i]) {
					continue;
				}
				visited[i] = true;
				recursive(idx + 1, sum + number[i], number, i);
				visited[i] = false;
			}
		}
	}
}
