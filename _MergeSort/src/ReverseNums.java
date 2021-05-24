class ReverseNums {
    public int reversePairs(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums[j];j++) {
                if(nums[i]>nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
