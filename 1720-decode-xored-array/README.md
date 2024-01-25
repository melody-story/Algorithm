<h2><a href="https://leetcode.com/problems/decode-xored-array/">1720. Decode XORed Array</a></h2><h3>Easy</h3><hr><div><p>There is a <strong>hidden</strong> integer array <code>arr</code> that consists of <code>n</code> non-negative integers.</p>

<p>It was encoded into another integer array <code>encoded</code> of length <code>n - 1</code>, such that <code>encoded[i] = arr[i] XOR arr[i + 1]</code>. For example, if <code>arr = [1,0,2,1]</code>, then <code>encoded = [1,2,3]</code>.</p>

<p>You are given the <code>encoded</code> array. You are also given an integer <code>first</code>, that is the first element of <code>arr</code>, i.e. <code>arr[0]</code>.</p>

<p>Return <em>the original array</em> <code>arr</code>. It can be proved that the answer exists and is unique.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> encoded = [1,2,3], first = 1
<strong>Output:</strong> [1,0,2,1]
<strong>Explanation:</strong> If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> encoded = [6,2,7,3], first = 4
<strong>Output:</strong> [4,2,0,7,4]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= n &lt;= 10<sup>4</sup></code></li>
	<li><code>encoded.length == n - 1</code></li>
	<li><code>0 &lt;= encoded[i] &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= first &lt;= 10<sup>5</sup></code></li>
</ul>
</div>



---

## XOR 연산이란?
- XOR 연산은 입력값이 같지 않으면 1을 같으면 0을 출력합니다. 
- 이는 두 입력 중 하나만이 배타적으로 참일 경우에만 일어납니다. 
- 이 연산은 더해서 mod 2 를 구하는 것의 결과와 동일합니다. 
- 연산기호는 `^` 이다.
- 다음은 진리표이다.

>0 XOR 0 = 0  <br>
>0 XOR 1 = 1  <br>
>1 XOR 0 = 1  <br>
>1 XOR 1 = 0  <br>
> 
> 
> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;100111001011010100111010 <br>
> XOR 010110100001101111011000 <br>
> ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ <br>
> &emsp;&emsp;&emsp;&emsp;&emsp;= 110001101010111011100010
