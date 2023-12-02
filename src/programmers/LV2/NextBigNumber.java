package programmers.LV2;

public class NextBigNumber {

	public static void main(String[] args) {
		System.out.println(solution(78));
	}

	public static int solution(int n) {
		String binary = Integer.toBinaryString(n);
		int count = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) - '0' == 1) {
				count++;
			}
		}
		return getNumber(n + 1, count);
	}

	public static int getNumber(int min, int cnt) {
		int num;
		for (int i = min; ; i++) {
			int count = 0;
			String binary = Integer.toBinaryString(i);
			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j) - '0' == 1) {
					count++;
				}
			}
			if (cnt == count) {
				num = i;
				break;
			}
		}
		return num;
	}
}
