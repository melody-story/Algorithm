class Solution {
	public boolean solution(String s) {
		return (s.length() == 4 || s.length() == 6) && s.matches("[0-9]+");
	}
}


// 더간단하게
class Solution {
	public boolean solution(String s) {
		return s.matches("[0-9]{4}|[0-9]{6}");
	}
}