package programmers;

public class FoodFight {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		System.out.println(solution(food));
	}

	public static String solution(int[] food) {
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < food.length; i++) {
			sb.append(String.valueOf(i).repeat(food[i] / 2));
		}

		String answer = sb.toString();
		return answer + 0 + sb.reverse();
	}
}
