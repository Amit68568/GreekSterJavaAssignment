public class LeetCodeIntersectionOfTwoArray {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1}, nums2[] = {2,2};
      int a[]=  intersection(nums1, nums2);
      for (int i : a) {
          System.out.println(i + " ");
      }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        int[] intersect = new int[Math.min(nums1.length, nums2.length)];
  int index = 0;
  for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
      if (nums1[i] == nums2[j]) {
        boolean isUnique = true;
        for (int k = 0; k < index; k++) {
          if (nums1[i] == intersect[k]) {
            isUnique = false;
          }
        }
        if (isUnique) {
          intersect[index++] = nums1[i];   
        }
      }
    }
  }
  int[] result = new int[index];
  for (; index-1 >= 0; index--) {
    result[index-1] = intersect[index-1];
  }
  return result;
        
    }
}
