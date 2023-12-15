package programmers.LV2;

//  ["최소 필요 피로도", "소모 피로도"]
// 중복 X, 순서 O

public class DegreeOfFatigue {

	static int[] selected;
	static boolean[] visited;
	static int max;

	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
		System.out.println(solution(k, dungeons));
	}

	public static int solution(int k, int[][] dungeons) {
		selected = new int[dungeons.length];
		visited = new boolean[dungeons.length + 1];
		recursive(0, dungeons, k);
		return max;
	}

	public static void recursive(int idx, int[][] dungeons, int k) {
		if (idx == selected.length) {
			calculate(dungeons, k);
		} else {

			for (int i = 1; i <= dungeons.length; i++) {
				if (visited[i]) {
					continue;
				}
				selected[idx] = i;
				visited[i] = true;
				recursive(idx + 1, dungeons, k);
				selected[idx] = 0;
				visited[i] = false;
			}
		}
	}

	private static void calculate(int[][] dungeons, int k) {
		int tmp = 0;
		for (int i : selected) {
			if (k < dungeons[i - 1][0])
				break;
			tmp++;
			k -= dungeons[i - 1][1];
		}
		max = Math.max(tmp, max);
	}
}
