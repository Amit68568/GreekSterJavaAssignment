package Assignment(25-nov-2021);

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int check;
        for(int i=0;i<nums.length;i++){
        for (int j=i+1;j<nums.length;j++){
        check = nums[i]+nums[j];
        if(check == target){
        return new int[]{i,j};
        }
        }
        }
        return null;
        }
}
