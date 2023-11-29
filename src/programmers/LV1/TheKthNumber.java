package programmers.LV1;

import java.util.Arrays;

public class TheKthNumber {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(arr, commands)));
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int[] arr = new int[b - a + 1];
			int idx = 0;
			for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
				arr[idx] = array[j];
				idx++;
			}
			Arrays.sort(arr);
			answer[i] = arr[commands[i][2] - 1];
		}
		return answer;
	}
}
