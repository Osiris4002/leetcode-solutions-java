class Solution {
    public int findMiddleIndex(int[] nums) {
        int lsum = 0;
        int sWin = 0;
        for(int n : nums){
            sWin += n;
        }

        for(int i = 0; i < nums.length; i++){
               sWin -= nums[i];

               if(lsum == sWin)
               return i;

               lsum += nums[i];
        }

        return -1;

    }
}