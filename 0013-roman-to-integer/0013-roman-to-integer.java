class Solution {
    public int romanToInt(String s) {
        	HashMap<String, Integer> hashMap1 = new HashMap<>();
			hashMap1.put("I", 1);
			hashMap1.put("V", 5);
			hashMap1.put("X", 10);
			hashMap1.put("L", 50);
			hashMap1.put("C", 100);
			hashMap1.put("D", 500);
			hashMap1.put("M", 1000);
			HashMap<String, Integer> hashMap2 = new HashMap<>();
			hashMap2.put("IV", 4);
			hashMap2.put("IX", 9);
			hashMap2.put("XL", 40);
			hashMap2.put("XC", 90);
			hashMap2.put("CD", 400);
			hashMap2.put("CM", 900);
			int sum = 0;
			Set<String> keySet2 = hashMap2.keySet();
			Set<String> keySet1 = hashMap1.keySet();
			while (!s.equals("")) {
				for (String key : keySet2) {
					if (s.contains(key)) {
						sum += hashMap2.get(key);
						s = s.replaceFirst(key, "");
					}
				}
				for (String key : keySet1) {
					if (s.contains(key)) {
						sum += hashMap1.get(key);
						s = s.replaceFirst(key, "");
					}
				}
			}
			return sum;
    }
}