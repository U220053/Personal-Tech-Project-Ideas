class Solution {
    Boolean a[][];
    public boolean canPartition(int[] nums) {
   
        int sum = 0;
        int n = nums.length;
        
        for(int i : nums) sum+=i;
        
        if(sum%2!=0) return false;
        
        sum /= 2;
        
        a = new Boolean[n+1][sum+1];
        
        return subsetSum(nums,0,sum);
    }
    
    boolean subsetSum(int[] nums, int pos, int sum){
        if(sum==0) return true;
        
        else if(pos>=nums.length || sum<0) return false;
        
        if(a[pos][sum]!=null) return a[pos][sum];
        
        return a[pos][sum] = subsetSum(nums,pos+1,sum-nums[pos]) ||
                                subsetSum(nums,pos+1,sum);
        
        
    }
}