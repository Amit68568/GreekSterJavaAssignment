
public class FindElementInRoataryArray {
 public static void main(String s[]) {
	 int arr[]= {4,5,6,7,0,1,2};
	 int search=1;
	 int s1=search(arr,search);
	 System.out.println(s1);
	 

}
 
 public static int search(int[] A, int tar) {
	    int l = 0;
	    int h = A.length - 1;
	    while (l < h) {
	        int mid = (l + h) / 2;
	        if (A[mid] == tar) return mid;
	        
	        if (A[l] <= A[mid]) {
	            if (tar >= A[l] && tar < A[mid]) {
	                h = mid - 1;
	            } else {
	                l = mid + 1;
	            }
	        } else {
	            if (tar > A[mid] && tar <= A[h]) {
	                l = mid + 1;
	            } else {
	                h = mid - 1;
	            }
	        }
	    }
	    return A[l] == tar ? l : -1;
	    }
}