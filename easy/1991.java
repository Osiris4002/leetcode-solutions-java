class Solution {
    public int findMiddleIndex(int[] nums) {
        int middleindex = -1;
        for(int i =0; i< nums.length; i++){
            int lsum = 0;
            int rsum = 0;

            for(int l = 0; l<= i-1; l++){
                lsum += nums[l];
            }

            for(int r = i+1; r< nums.length;r++){
                rsum += nums[r];
            }

            if(lsum == rsum){
                    middleindex = middleindex != -1 ?(middleindex < i ? middleindex : i):i; 
            }
        }

        return middleindex;
    }
}