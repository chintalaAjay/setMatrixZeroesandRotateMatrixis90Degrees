package Strivers;

class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low1=0;
        int high1=n-1;
        int ans1=-1;
        while(low1<=high1){
            int mid=(low1+high1)/2;
            if(nums[mid]==target){
                ans1=mid;
                high1=mid-1;
            }
            else if(target>nums[mid]) low1=mid+1;
            else high1=mid-1;
        }

        int low2=0;
        int high2=n-1;
        int ans2=-1;
        while(low2<=high2){
            int mid=(low2+high2)/2;
            if(nums[mid]==target){
                ans2=mid;
                low2=mid+1;
            }
            else if(target>nums[mid]) low2=mid+1;
            else high2=mid-1;
        }
        return new int[]{ans1,ans2};
        
    }
}