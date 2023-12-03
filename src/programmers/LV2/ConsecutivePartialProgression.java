package programmers.LV2;

import java.util.HashSet;
import java.util.Set;

public class ConsecutivePartialProgression {

	public static void main(String[] args) {
		int[] elements = {7, 9, 1, 1, 4};
		System.out.println(solution(elements));
	}

	public static int solution(int[] elements) {
		int[] sumArr = new int[elements.length * 2 - 1];
		Set<Integer> set = new HashSet<>();

		int tmp = 0;
		for (int i = 0; i < sumArr.length; i++) {
			tmp += elements[i % elements.length];
			sumArr[i] = tmp;
		}

		for (int i = 1; i <= elements.length; i++) {
			for (int j = 0; j < sumArr.length; j++) {
				if(i == 1) {
					if(j < elements.length) {
						set.add(elements[j]);
					}
				} else {
					if(j + i - 1 < sumArr.length) {
						if(j == 0) {
							set.add(sumArr[j + i - 1]);
						} else {
							set.add(sumArr[j + i - 1] - sumArr[j - 1]);
						}
					}
				}
			}
		}
		return set.size();
	}
}
