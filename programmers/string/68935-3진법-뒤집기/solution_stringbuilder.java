static class Solution {
	public int solution(int n) {
		String string = Integer.toString(n, 3);
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = string.length() - 1; i > -1; i--) {
			stringBuilder.append(string.charAt(i));
		}
		return Integer.parseInt(stringBuilder.toString(), 3);
	}
}
