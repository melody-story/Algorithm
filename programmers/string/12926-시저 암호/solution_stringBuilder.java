class Solution {
	public String solution(String s, int n) {
		StringBuilder stringBuilder = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			stringBuilder.append(push(c, n));
		}
		return stringBuilder.toString();
	}

	public char push(char c, int i) {
		if (!Character.isAlphabetic(c)) {
			return c;
		}
		int offSet = Character.isUpperCase(c) ? 'A' : 'a';
		int position = c - offSet;
		position = (position + i) % ('z' - 'a' + 1);
		return (char)(offSet + position);
	}
}