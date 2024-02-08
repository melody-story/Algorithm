import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int[] solution(String s) {
		int count = 0;
		int zeroCount = 0;
		while (true) {
			if (s.equals("1"))
				break;
			String[] split = s.split("");
			List<String> strings = new ArrayList<>(Arrays.asList(split));
			strings.removeAll(new ArrayList<>(Arrays.asList("0")));
			zeroCount += s.length() - strings.size();
			s = Integer.toString(strings.size(), 2);
			count++;
		}
		return new int[] {count, zeroCount};
	}
}

/*
테스트 1 〉	통과 (0.69ms, 81.9MB)
테스트 2 〉	통과 (53.15ms, 88.9MB)
테스트 3 〉	통과 (0.37ms, 71.1MB)
테스트 4 〉	통과 (0.30ms, 74.1MB)
테스트 5 〉	통과 (0.33ms, 76.9MB)
테스트 6 〉	통과 (1.99ms, 84.7MB)
테스트 7 〉	통과 (2.17ms, 72.9MB)
테스트 8 〉	통과 (1.47ms, 77.1MB)
테스트 9 〉	통과 (42.06ms, 83.7MB)
테스트 10 〉	통과 (64.03ms, 101MB)
테스트 11 〉	통과 (56.19ms, 86.1MB)
*/