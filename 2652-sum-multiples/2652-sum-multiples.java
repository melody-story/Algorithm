class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        boolean visited[] = new boolean[n + 1];

        // Find the Numbers Divisible by 3
        for(int i = 3; i <= n; i += 3) {
            if(!visited[i]) {
                sum += i;
                visited[i] = true;
            }
        }

        // Find the Numbers Divisible by 5
        for(int i = 5; i <= n; i += 5) {
            if(!visited[i]) {
                sum += i;
                visited[i] = true;
            }
        }

        // Find the Numbers Divisible by 7
        for(int i = 7; i <= n; i += 7) {
            if(!visited[i]) {
                sum += i;
                visited[i] = true;
            }
        }

        return sum;
    }
}