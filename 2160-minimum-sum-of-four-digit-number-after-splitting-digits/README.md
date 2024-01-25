<h2><a href="https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/">2160. Minimum Sum of Four Digit Number After Splitting Digits</a></h2><h3>Easy</h3><hr><div><p>You are given a <strong>positive</strong> integer <code>num</code> consisting of exactly four digits. Split <code>num</code> into two new integers <code>new1</code> and <code>new2</code> by using the <strong>digits</strong> found in <code>num</code>. <strong>Leading zeros</strong> are allowed in <code>new1</code> and <code>new2</code>, and <strong>all</strong> the digits found in <code>num</code> must be used.</p>

<ul>
	<li>For example, given <code>num = 2932</code>, you have the following digits: two <code>2</code>'s, one <code>9</code> and one <code>3</code>. Some of the possible pairs <code>[new1, new2]</code> are <code>[22, 93]</code>, <code>[23, 92]</code>, <code>[223, 9]</code> and <code>[2, 329]</code>.</li>
</ul>

<p>Return <em>the <strong>minimum</strong> possible sum of </em><code>new1</code><em> and </em><code>new2</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> num = 2932
<strong>Output:</strong> 52
<strong>Explanation:</strong> Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> num = 4009
<strong>Output:</strong> 13
<strong>Explanation:</strong> Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1000 &lt;= num &lt;= 9999</code></li>
</ul>
</div>

---

## solution 1

- 숫자 각 자리 값을 배열로 바꾸기 위하여 String.toCharArray() 메소드 사용
    - 단점 : 정렬 작업을 위해 Collection객체로 전환해주어야하는데, 이를 위해서는 ArrayList에 배열 각각의 값을 담아주어 O(n)의 시간 복잡도 발생
    - 개선 : while문을 적용하여, 숫자를 10으로 나누어 떨어지는 나머지로 각자리의 수를 구함.


```java
// 1 ms 40.3 MB
class Solution {
    public int minimumSum(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        List<Integer> chars = new ArrayList<>(charArray.length);
        for (char cha : charArray){
            chars.add(Character.getNumericValue(cha));
        }
        Collections.sort(chars);
        return (chars.get(0) * 10 + chars.get(2)) + (chars.get(1) * 10 + chars.get(3));
    }
}
```

## improved solution
```java
// 0 ms 40.5 MB	
class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> temp = new ArrayList<>();
        while (num != 0) {
            temp.add(num % 10);
            num = num / 10;
        }
        Collections.sort(temp);
        int num1 = temp.get(0) * 10 + temp.get(2);
        int num2 = temp.get(1) * 10 + temp.get(3);
        return num1 + num2;

    }
}
```