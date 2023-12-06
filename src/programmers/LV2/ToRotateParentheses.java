package programmers.LV2;

import java.util.Stack;

public class ToRotateParentheses {

	public static void main(String[] args) {
		String s = "}}}";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2 * s.length() - 1; i++) {
			sb.append(s.charAt(i % s.length()));
		}
		for (int i = 0; i < s.length(); i++) {
			boolean result = checkCorrect(sb.substring(i, i + s.length()));
			if (result) {
				answer++;
			}
		}
		return answer;
	}

	public static boolean checkCorrect(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
