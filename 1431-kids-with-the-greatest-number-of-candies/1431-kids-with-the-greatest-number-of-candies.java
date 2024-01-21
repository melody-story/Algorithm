class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies >= max) ? true : false);
        }
        return result;
    }
}