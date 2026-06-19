class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(int v: map.keySet()){
            int val = map.get(v);

            if(val % k == 0)
            {
                sum += (val*v);
            }
        }

        return sum;
    }
}