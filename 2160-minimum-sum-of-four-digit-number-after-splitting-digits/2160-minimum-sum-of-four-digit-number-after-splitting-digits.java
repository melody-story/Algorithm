class Solution {
    public int minimumSum(int num) {
        List<Integer> chars = new ArrayList<>();
        while(num!=0){
               chars.add(num%10);
               num=num/10;

           }
        Collections.sort(chars);
        return (chars.get(0) * 10 + chars.get(2)) + (chars.get(1) * 10 + chars.get(3));
    }
}