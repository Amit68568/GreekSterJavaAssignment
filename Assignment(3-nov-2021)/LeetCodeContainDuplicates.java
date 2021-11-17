import java.util.Arrays;

public class LeetCodeContainDuplicates {
    public static void main(String[] args) {
     int a[]={1,2,3,1};
     System.out.println(containsDuplicate(a));   
    
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        
    }
}
