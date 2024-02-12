/*
	시간복잡도 :  O(n), 공간복잡도 : O(n)
 */
class Solution {
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String[] cloth : clothes) {
			String key_ = cloth[1];
			if (!hashMap.containsKey(key_)) {
				hashMap.put(key_, 1);
			} else {
				Integer value = hashMap.get(key_);
				hashMap.put(key_, ++value);
			}
		}
		for (int v : hashMap.values()) {
			answer *= v + 1;
		}
		return answer - 1;
	}
}
/*
테스트 1 〉	통과 (0.05ms, 71.8MB)
테스트 2 〉	통과 (0.07ms, 76.3MB)
테스트 3 〉	통과 (0.05ms, 76.5MB)
테스트 4 〉	통과 (0.17ms, 75.9MB)
테스트 5 〉	통과 (0.08ms, 70.1MB)
테스트 6 〉	통과 (0.06ms, 74.6MB)
테스트 7 〉	통과 (0.05ms, 72.2MB)
테스트 8 〉	통과 (0.09ms, 74.2MB)
테스트 9 〉	통과 (0.05ms, 77.1MB)
테스트 10 〉	통과 (0.03ms, 76.3MB)
테스트 11 〉	통과 (0.07ms, 76.1MB)
테스트 12 〉	통과 (0.05ms, 69.5MB)
테스트 13 〉	통과 (0.06ms, 77.5MB)
테스트 14 〉	통과 (0.04ms, 73.6MB)
테스트 15 〉	통과 (0.04ms, 79MB)
테스트 16 〉	통과 (0.03ms, 74.8MB)
테스트 17 〉	통과 (0.07ms, 71.4MB)
테스트 18 〉	통과 (0.07ms, 76MB)
테스트 19 〉	통과 (0.05ms, 82.3MB)
테스트 20 〉	통과 (0.05ms, 75.8MB)
테스트 21 〉	통과 (0.04ms, 73.1MB)
테스트 22 〉	통과 (0.04ms, 73.1MB)
테스트 23 〉	통과 (0.05ms, 76.8MB)
테스트 24 〉	통과 (0.05ms, 77.8MB)
테스트 25 〉	통과 (0.05ms, 71.5MB)
테스트 26 〉	통과 (0.05ms, 78.5MB)
테스트 27 〉	통과 (0.04ms, 75.5MB)
테스트 28 〉	통과 (0.06ms, 77.1MB)

채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */