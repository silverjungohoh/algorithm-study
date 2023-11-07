package programmers;

public class SplitString {

	public static void main(String[] args) {
		String s = "banana";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;

		int x = s.charAt(0);
		int cnt1 = 1; // x 나온 횟수
		int cnt2 = 0; // x 아닌 다른 글자들이 나온 횟수

		for (int i = 1; i < s.length(); i++) {
			if (cnt1 == cnt2) {
				x = s.charAt(i);
				cnt1 = 1;
				cnt2 = 0;
				answer++;
			} else {
				if (x == s.charAt(i)) {
					cnt1++;
				} else {
					cnt2++;
				}
			}
		}
		return answer + 1;
	}
}
