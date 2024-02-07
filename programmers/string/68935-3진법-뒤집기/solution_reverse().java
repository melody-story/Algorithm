class Solution {
	public int solution(int n) {
		String string = Integer.toString(n, 3);
		String stringBuilder = new StringBuilder(string).reverse().toString();
		return Integer.parseInt(stringBuilder.toString(), 3);
	}
}
