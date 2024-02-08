import java.util.Set;
import java.util.HashSet;

class Solution {
	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
		for (Integer i : nums) {
			set.add(i);
		}
		int getSize = nums.length / 2;
		int count = set.size();
		return count >= getSize ? getSize : count;
	}
}

/*
테스트 1 〉	통과 (0.04ms, 68MB)
테스트 2 〉	통과 (0.12ms, 78.4MB)
테스트 3 〉	통과 (0.09ms, 75.1MB)
테스트 4 〉	통과 (0.14ms, 74.4MB)
테스트 5 〉	통과 (0.04ms, 77MB)
테스트 6 〉	통과 (0.12ms, 75.1MB)
테스트 7 〉	통과 (0.24ms, 72.2MB)
테스트 8 〉	통과 (0.36ms, 76.2MB)
테스트 9 〉	통과 (0.18ms, 74MB)
테스트 10 〉	통과 (0.28ms, 74.4MB)
테스트 11 〉	통과 (0.20ms, 78.1MB)
테스트 12 〉	통과 (0.29ms, 78.9MB)
테스트 13 〉	통과 (0.86ms, 83.3MB)
테스트 14 〉	통과 (0.86ms, 75.4MB)
테스트 15 〉	통과 (0.59ms, 77.5MB)
테스트 16 〉	통과 (3.39ms, 75.9MB)
테스트 17 〉	통과 (3.09ms, 70MB)
테스트 18 〉	통과 (6.22ms, 81.5MB)
테스트 19 〉	통과 (2.64ms, 80.2MB)
테스트 20 〉	통과 (2.00ms, 77.4MB)
 */