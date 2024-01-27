<h2><a href="https://leetcode.com/problems/minimum-number-game/">2974. Minimum Number Game</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>0-indexed</strong> integer array <code>nums</code> of <strong>even</strong> length and there is also an empty array <code>arr</code>. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:</p>

<ul>
	<li>Every round, first Alice will remove the <strong>minimum</strong> element from <code>nums</code>, and then Bob does the same.</li>
	<li>Now, first Bob will append the removed element in the array <code>arr</code>, and then Alice does the same.</li>
	<li>The game continues until <code>nums</code> becomes empty.</li>
</ul>

<p>Return <em>the resulting array </em><code>arr</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [5,4,2,3]
<strong>Output:</strong> [3,2,5,4]
<strong>Explanation:</strong> In round one, first Alice removes 2 and then Bob removes 3. Then in arr firstly Bob appends 3 and then Alice appends 2. So arr = [3,2].
At the begining of round two, nums = [5,4]. Now, first Alice removes 4 and then Bob removes 5. Then both append in arr which becomes [3,2,5,4].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [2,5]
<strong>Output:</strong> [5,2]
<strong>Explanation:</strong> In round one, first Alice removes 2 and then Bob removes 5. Then in arr firstly Bob appends and then Alice appends. So arr = [5,2].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
	<li><code>nums.length % 2 == 0</code></li>
</ul>
</div>

---

## Solution 1

- 리스트에 값을 담아서 정렬
  - 불필요한 객체 생성으로 메로리를 차지하게 된다.
- 배열도 정렬이 가능하다는 점을 인지 못함.

```java
// 6ms 44.7MB
class Solution {
        public int[] numberGame(int[] nums) {
            List<Integer> list = new ArrayList<>(100);
            for (int n :nums) {
                list.add(n);
            }
            list.sort(Comparator.naturalOrder());

            for (int i = 0; i < nums.length; i+=2) {
                nums[i] = list.get(i+1);
                nums[i+1] = list.get(i);
            }
            return nums;
        }
    }
```


## Improved Solution

- Arrays 클래스의 sort() 메소드를 사용하여, 배열을 정렬하였다.
- 후에 2개씩 각 자리를 바꾸어 주었다.

```java
// 2ms 44.5MB
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}
```