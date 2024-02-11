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
		HashSet<String> hashSet = new HashSet<>();
		for (int i = 0; i < phone_book.length; i++) {
			String item = list.get(i);
			Iterator<String> iterator = hashSet.iterator();
			while (iterator.hasNext()) {
				if (item.startsWith(iterator.next())) {
					answer = false;
					break;
				}
			}
			if (!hashSet.contains(item)) {
				hashSet.add(item);
			}
		}
		return answer;
	}
}

/*
정확성  테스트
테스트 1 〉	통과 (0.55ms, 77.2MB)
테스트 2 〉	통과 (0.51ms, 70.4MB)
테스트 3 〉	통과 (0.35ms, 74.5MB)
테스트 4 〉	통과 (0.48ms, 73.2MB)
테스트 5 〉	통과 (0.47ms, 80.8MB)
테스트 6 〉	통과 (0.42ms, 78.2MB)
테스트 7 〉	통과 (0.36ms, 72.5MB)
테스트 8 〉	통과 (0.34ms, 76.7MB)
테스트 9 〉	통과 (0.48ms, 74.9MB)
테스트 10 〉	통과 (0.40ms, 71.2MB)
테스트 11 〉	통과 (0.43ms, 73.2MB)
테스트 12 〉	통과 (0.34ms, 74.4MB)
테스트 13 〉	통과 (0.33ms, 75.8MB)
테스트 14 〉	통과 (37.69ms, 92.8MB)
테스트 15 〉	통과 (87.96ms, 99.7MB)
테스트 16 〉	통과 (48.78ms, 84.9MB)
테스트 17 〉	통과 (65.00ms, 76.4MB)
테스트 18 〉	통과 (116.71ms, 92.4MB)
테스트 19 〉	통과 (156.13ms, 80.9MB)
테스트 20 〉	통과 (173.54ms, 77.2MB)


효율성  테스트
테스트 1 〉	통과 (74.81ms, 59.7MB)
테스트 2 〉	통과 (62.14ms, 59.4MB)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)

채점 결과
정확성: 83.3
효율성: 8.3
합계: 91.7 / 100.0
 */