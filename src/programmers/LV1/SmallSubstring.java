package programmers.LV1;

// p의 길이 > 1 이상 18 이하이므로 int 범위 넘어감

public class SmallSubstring {

	public static void main(String[] args) {
		String t = "500220839878";
		String p = "7";
		System.out.println(solution(t, p));
	}

	public static int solution(String t, String p) {
		int answer = 0;
		int len = p.length();
		long pNum = Long.parseLong(p);
		String tmp; // 부분 문자열

		for (int i = 0; i <= t.length() - len; i++) {
			tmp = t.substring(i, i + len);

			if (Long.parseLong(tmp) <= pNum) {
				answer++;
			}

		}
		return answer;
	}
}
