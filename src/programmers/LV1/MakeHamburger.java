package programmers.LV1;

// 빵 = 1, 야채 = 2, 고기 = 3

public class MakeHamburger {

	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(ingredient));
	}

	public static int solution(int[] ingredient) {
		int answer = 0;
		int idx = 0;
		int[] stack = new int[ingredient.length];

		for (int k : ingredient) {
			stack[idx++] = k;
			if (idx >= 4) {
				if (stack[idx - 4] == 1
					&& stack[idx - 3] == 2
					&& stack[idx - 2] == 3
					&& stack[idx - 1] == 1) {
					answer++;
					idx -= 4;
				}
			}
		}
		return answer;
	}
}
