class Solution {
	public String solution(String new_id) {
		if (!new_id.matches("^[^.][a-z0-9-_.]$[^.]{3,15}")) {
			new_id = new_id.toLowerCase();
			new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
			new_id = new_id.replaceAll("([.]{2,})", ".");
			new_id = new_id.replaceAll("[.]$", "");
			new_id = new_id.replaceAll("^[.]", "");
			if (new_id.length() >= 16) {
				new_id = new_id.substring(0, 15);
				new_id = new_id.replaceAll("[.]$", "");
			} else if (new_id.length() == 0) {
				new_id = "a";
			}
			StringBuilder sb = new StringBuilder();
			if (new_id.length() <= 2) {
				sb.append(new_id);
				while (sb.length() != 3) {
					sb.append(new_id.charAt(new_id.length() - 1));
				}
				new_id = sb.toString();
			}
		}
		return new_id;
	}
}
