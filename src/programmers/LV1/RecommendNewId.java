package programmers.LV1;

// 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용
// 마침표(.)는 처음과 끝에 사용할 수 없음 + 연속으로 사용할 수 없음

public class RecommendNewId {

	public static void main(String[] args) {
		System.out.println(solution(".ab......cd."));
	}

	public static String solution(String new_id) {
		String answer;
		// 1단계
		String id = new_id.toLowerCase();
		StringBuilder tmp = new StringBuilder();
		// 2단계
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '.' || c == '_' || c == '-') {
				tmp.append(c);
			}
		}
		answer = tmp.toString();
		// 3단계
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		// 4단계
		if (answer.length() > 0 && answer.charAt(0) == '.') {
			answer = answer.substring(1);
		}
		if (answer.length() > 0 && answer.charAt(answer.length() - 1) == '.') {
			answer = answer.substring(0, answer.length() - 1);
		}
		// 5단계
		if (answer.length() == 0) {
			answer = "a";
		}
		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}
		// 7단계
		if (answer.length() <= 2) {
			while (answer.length() != 3) {
				answer = answer.concat(String.valueOf(answer.charAt(answer.length() - 1)));
			}
		}
		return answer;
	}
}
