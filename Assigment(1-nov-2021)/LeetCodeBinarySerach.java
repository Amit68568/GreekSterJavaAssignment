public class LeetCodeBinarySerach {
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[low]==target){
                return low;
            }else if(nums[high]==target){
                return high;
            }else if(target>nums[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int a[]={-1,0,3,5,9,12}, target = 9;
       
        System.out.println( search(a, target));
    }
}
