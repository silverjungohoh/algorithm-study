package programmers.LV1;

public class GymClothes {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] arr = new int[n + 1];

		for (int i : lost) {
			arr[i]--;
		}

		for (int i : reserve) {
			arr[i]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				if (i > 0 && arr[i - 1] == 1) {
					arr[i - 1]--;
					arr[i]++;
				} else if (i < arr.length - 1 && arr[i + 1] == 1) {
					arr[i + 1]--;
					arr[i]++;
				}
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= 0)
				answer++;
		}
		return answer;
	}
}
