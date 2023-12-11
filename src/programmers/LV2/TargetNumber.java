package programmers.LV2;

// 순서 o, 중복 o

public class TargetNumber {

	static char[] selected;
	static char[] arr = {'+', '-'};
	static int cnt;

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
		selected = new char[numbers.length];
		recursive(0, target, numbers);
		return cnt;
	}

	public static void recursive(int idx, int target, int[] numbers) {
		if (idx == selected.length) {
			if(calculate(numbers, selected) == target) {
				cnt++;
			}
		} else {
			for (char c : arr) {
				selected[idx] = c;
				recursive(idx + 1, target, numbers);
				selected[idx] = 0;
			}
		}
	}

	public static int calculate(int[] nums, char[] selected) {
		int sum = 0;
		for (int i = 0; i < selected.length; i++) {
			if (selected[i] == '+') {
				sum += nums[i];
			} else {
				sum += nums[i] * -1;
			}
		}
		return sum;
	}
}
