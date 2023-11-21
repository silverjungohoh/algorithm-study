package programmers.LV1;

// 연속해서 같은 발음을 할 수 없음

public class Babbling2 {

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		System.out.println(solution(babbling));
	}

	public static int solution(String[] babbling) {
		int answer = 0;
		String[] arr = {"aya", "ye", "woo", "ma"};

		for (String s : babbling) {
			String str = s;
			for (int j = 0; j < arr.length; j++) {
				if (str.contains(arr[j])) {
					str = str.replace(arr[j], String.valueOf(j));
				}
			}
			boolean is = true;
			int before = Integer.MAX_VALUE;
			for (int j = 0; j < str.length(); j++) {
				int num = str.charAt(j) - '0';
				if (!(0 <= num && num <= arr.length - 1 && before != num)) {
					is = false;
					break;
				}
				before = num;
			}
			if (is)
				answer++;
		}
		return answer;
	}
}
