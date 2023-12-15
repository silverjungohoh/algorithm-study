package programmers.LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VowelDictionary {

	static int len;
	static char[] vowel = {'A', 'E', 'I', 'O', 'U'};
	static List<String> list;

	public static void main(String[] args) {
		String word = "AAAE";
		System.out.println(solution(word));
	}

	public static int solution(String word) {
		list = new ArrayList<>();
		for (int i = 1; i <= vowel.length; i++) {
			len = i;
			recursive(0, "");
		}
		Collections.sort(list);
		return list.indexOf(word) + 1;
	}

	public static void recursive(int idx, String str) {
		if (idx == len) {
			list.add(str);
		} else {

			for (char c : vowel) {
				recursive(idx + 1, str + c);
			}
		}
	}
}
