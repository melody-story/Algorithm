class Solution {
	public int solution(String s) {
		Map<String, String> digitToAlpha = new HashMap<>(10);
		digitToAlpha.put("zero", "0");
		digitToAlpha.put("one", "1");
		digitToAlpha.put("two", "2");
		digitToAlpha.put("three", "3");
		digitToAlpha.put("four", "4");
		digitToAlpha.put("five", "5");
		digitToAlpha.put("six", "6");
		digitToAlpha.put("seven", "7");
		digitToAlpha.put("eight", "8");
		digitToAlpha.put("nine", "9");
		for (String alpha : digitToAlpha.keySet()) {
			s = s.replace(alpha, digitToAlpha.get(alpha));
		}
		return Integer.valueOf(s);
	}
}

/*
테스트 1 〉	통과 (0.10ms, 70.8MB)
테스트 2 〉	통과 (0.07ms, 67.4MB)
테스트 3 〉	통과 (0.13ms, 77.9MB)
테스트 4 〉	통과 (0.09ms, 75.4MB)
테스트 5 〉	통과 (0.11ms, 75.3MB)
테스트 6 〉	통과 (0.13ms, 74MB)
테스트 7 〉	통과 (0.09ms, 78.5MB)
테스트 8 〉	통과 (0.08ms, 73.1MB)
테스트 9 〉	통과 (0.14ms, 76.5MB)
테스트 10 〉	통과 (0.07ms, 74MB)
 */