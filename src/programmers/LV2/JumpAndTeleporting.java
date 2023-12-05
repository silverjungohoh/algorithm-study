package programmers.LV2;

// 한 번에 k칸 점프 or (현재까지 온 거리) x 2로 순간 이동
// 순간이동을 하면 건전지 사용량이 줄지 않음
// 앞으로 k칸을 점프하면 건전지 사용량 k만큼 감소

// DP 사용 (bottom-up)

public class JumpAndTeleporting {

	public static void main(String[] args) {
		System.out.println(solution(5000));
		System.out.println(mySolution(5000));
	}

	public static int solution(int n) {
		int ans = 0;
		int tmp = n; // 도착점에서 시작

		while (tmp != 0) {
			if (tmp % 2 == 0) {
				tmp /= 2;
			} else {
				tmp -= 1;
				ans++;
			}
		}
		return ans;
	}

	// 처음 생각한 풀이 (효율성 실패)
	public static int mySolution(int n) {
		int[] dp = new int[n + 1];
		dp[1] = 1;

		for (int i = 2; i < dp.length; i++) {
			if(i % 2 == 0) {
				dp[i] = dp[i / 2];
			} else {
				dp[i] = dp[i - 1] + 1;
			}
		}
		return dp[dp.length - 1];
	}
}
