import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Solution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		List<String> list = Arrays.asList(phone_book);
		list.sort(Comparator.naturalOrder());
		for (int i = 0; i+1 < phone_book.length; i++) {
			String s1 = list.get(i);
			String s2 = list.get(i + 1);
			if (s2.startsWith(s1)) {
				answer = false;
				break;
			}
		}
		return answer;
	}
}

/*
정확성  테스트
테스트 1 〉	통과 (1.99ms, 81.9MB)
테스트 2 〉	통과 (0.38ms, 78.1MB)
테스트 3 〉	통과 (0.30ms, 79.9MB)
테스트 4 〉	통과 (0.40ms, 71MB)
테스트 5 〉	통과 (0.40ms, 76.4MB)
테스트 6 〉	통과 (0.48ms, 75.6MB)
테스트 7 〉	통과 (0.43ms, 77.6MB)
테스트 8 〉	통과 (0.30ms, 73.1MB)
테스트 9 〉	통과 (0.39ms, 79.4MB)
테스트 10 〉	통과 (0.28ms, 74.6MB)
테스트 11 〉	통과 (0.51ms, 77.6MB)
테스트 12 〉	통과 (0.29ms, 78.7MB)
테스트 13 〉	통과 (0.39ms, 75.4MB)
테스트 14 〉	통과 (2.71ms, 79.9MB)
테스트 15 〉	통과 (2.76ms, 80.1MB)
테스트 16 〉	통과 (3.20ms, 72.9MB)
테스트 17 〉	통과 (4.11ms, 73.9MB)
테스트 18 〉	통과 (6.22ms, 80.1MB)
테스트 19 〉	통과 (5.40ms, 80.2MB)
테스트 20 〉	통과 (5.14ms, 90.9MB)

효율성  테스트
테스트 1 〉	통과 (32.44ms, 74.6MB)
테스트 2 〉	통과 (32.32ms, 74.4MB)
테스트 3 〉	통과 (335.24ms, 98.2MB)
테스트 4 〉	통과 (264.06ms, 96.5MB)
채점 결과

정확성: 83.3
효율성: 16.7
합계: 100.0 / 100.0
 */