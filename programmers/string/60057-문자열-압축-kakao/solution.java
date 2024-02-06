import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String s) {
		int min = Integer.MAX_VALUE;
		for (int n = 1; n <= s.length(); n++) {
			min = Math.min(min, getCompressStringLength(getSplitedStringArray(s, n)));
		}
		return min;
	}

	public List<String> getSplitedStringArray(String s, int n) {
		List<String> items = new ArrayList<>();
		for (int i = 0; i < s.length(); i = i + n) {
			String substring = s.substring(i, i + n > s.length() ? s.length() : i + n);
			items.add(substring);
		}
		return items;
	}

	public int getCompressStringLength(List<String> items) {
		String last = "";
		int cnt = 0;
		StringBuilder s1 = new StringBuilder();
		for (String item : items) {
			if (!item.equals(last)) {
				if (cnt > 1)
					s1.append(cnt);
				s1.append(last);
				cnt = 1;
				last = item;
			} else {
				cnt++;
			}
		}
		if (cnt > 1)
			s1.append(cnt);
		s1.append(last);
		return s1.length();
	}
}