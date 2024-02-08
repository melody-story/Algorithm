import java.util.Arrays;
import java.util.HashSet;

class Solution {
	public int solution(int[] nums) {
		Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		HashSet<Integer> set = new HashSet<>(Arrays.asList(array));
		int getSize = nums.length / 2;
		int count = set.size();
		return count >= getSize ? getSize : count;
	}
}
/*
테스트 1 〉	통과 (3.85ms, 75.8MB)
테스트 2 〉	통과 (3.18ms, 76.6MB)
테스트 3 〉	통과 (1.94ms, 73.9MB)
테스트 4 〉	통과 (1.95ms, 76MB)
테스트 5 〉	통과 (2.16ms, 78.2MB)
테스트 6 〉	통과 (2.22ms, 78.3MB)
테스트 7 〉	통과 (2.15ms, 72.4MB)
테스트 8 〉	통과 (2.50ms, 78.2MB)
테스트 9 〉	통과 (6.69ms, 89.6MB)
테스트 10 〉	통과 (2.04ms, 74.1MB)
테스트 11 〉	통과 (2.85ms, 77.9MB)
테스트 12 〉	통과 (2.58ms, 81.7MB)
테스트 13 〉	통과 (2.73ms, 66.5MB)
테스트 14 〉	통과 (2.64ms, 79.3MB)
테스트 15 〉	통과 (2.83ms, 78.9MB)
테스트 16 〉	통과 (7.01ms, 80.7MB)
테스트 17 〉	통과 (6.21ms, 82.4MB)
테스트 18 〉	통과 (5.07ms, 77.7MB)
테스트 19 〉	통과 (5.88ms, 78.1MB)
테스트 20 〉	통과 (5.56ms, 78.1MB)
 */