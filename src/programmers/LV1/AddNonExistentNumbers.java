package programmers.LV1;

public class AddNonExistentNumbers {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		boolean[] arr = new boolean[10];
		for (int num : numbers) {
			arr[num] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i]) answer += i;
		}
		return answer;
	}
}
