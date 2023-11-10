package programmers;

public class CodeJustForTwo {

	public static void main(String[] args) {
		String s = "klmnopqrstuvwxyz";
		String skip = "abcdefghij";
		int index = 20;
		System.out.println(solution(s, skip, index));
	}

	public static String solution(String s, String skip, int index) {

		int[] arr = new int[26];
		for (int i = 0; i < skip.length(); i++) {
			arr[skip.charAt(i) - 'a']++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int now = s.charAt(i) - 'a';
			int cnt = 0;
			for (int j = now + 1; ; j++) {
				if(arr[j % 26] == 0) {
					cnt++;
				}
				if (cnt == index) {
					sb.append((char)(j % 26 + 'a'));
					break;
				}
			}
		}
		return sb.toString();
	}
}

