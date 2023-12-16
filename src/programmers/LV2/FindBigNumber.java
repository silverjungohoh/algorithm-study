package programmers.LV2;

// 자신보다 뒤에 있는 숫자 중에서 자신보다 크면서 가장 가까이 있는 수

import java.util.Arrays;
import java.util.Stack;

public class FindBigNumber {

	public static void main(String[] args) {
		int[] numbers = {9, 1, 5, 3, 6, 2};
		System.out.println(Arrays.toString(solution(numbers)));
	}

	public static int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		Stack<Integer> st = new Stack<>(); // 배열의 인덱스를 담아야 함

		for (int i = 0; i < numbers.length; i++) {
			while (!st.empty() && numbers[st.peek()] < numbers[i]) {
				answer[st.pop()] = numbers[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			answer[st.pop()] = -1;
		}
		return answer;
	}
}
