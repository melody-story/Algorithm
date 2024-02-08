class Solution {
	public int[] solution(String s) {
		int count = 0;
		int result = 0;
		while (!s.equals("1")) {
			int zeroCount = countZero(s);
			result += zeroCount;
			s = Integer.toString(s.length() - zeroCount, 2);
			count++;
		}
		return new int[] {count, result};
	}

	public int countZero(String s) {
		int cnt = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '0') {
				cnt++;
			}
		}
		return cnt;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 73.6MB)
테스트 2 〉	통과 (3.84ms, 78.9MB)
테스트 3 〉	통과 (0.03ms, 77MB)
테스트 4 〉	통과 (0.03ms, 74MB)
테스트 5 〉	통과 (0.06ms, 74.5MB)
테스트 6 〉	통과 (0.10ms, 67.5MB)
테스트 7 〉	통과 (0.16ms, 76.6MB)
테스트 8 〉	통과 (0.08ms, 71.2MB)
테스트 9 〉	통과 (3.02ms, 72.4MB)
테스트 10 〉	통과 (5.10ms, 76.9MB)
테스트 11 〉	통과 (5.39ms, 69MB)
* */