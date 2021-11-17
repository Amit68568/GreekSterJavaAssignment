public class LeetCodeSumII {
    public static void main(String[] args) {
        int nums1[]={2,7,11,15},  nums2=9;
        int a[]=  twoSum(nums1, nums2);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
        }
        }
        return new int[2];
    }
}
