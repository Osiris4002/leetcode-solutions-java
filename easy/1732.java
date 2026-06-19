class Solution {
    public int largestAltitude(int[] gain) {
        int cAlt = 0;
        int maxAlt = cAlt;
        int n = gain.length;
        
        for(int g : gain){
            cAlt += g;

            if(maxAlt < cAlt)
            maxAlt = cAlt;
        }

        return maxAlt;
    }
}