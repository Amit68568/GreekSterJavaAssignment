public class AnticlockWiseWave2dArray {
    

	
	public static void main(String[] args) {
		
		int arr[][] = {{10,11,12,13},{14,15,16,17},{18,19,20,21},{22,23,24,25}};
		int top = 0, bottom = 3, left = 0, right = 3;
		int direction = 0;
		
		while(top<=bottom && left<=right) {
			if(direction == 0) {
				for(int i=top; i<=bottom; i++) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
			}
			else if(direction == 1) {
				for(int i=left; i<=right; i++) {
					System.out.print(arr[bottom][i]+" ");
				}
				bottom--;
			}
			else if(direction == 2) {
				for(int i=bottom; i>=top; i--) {
					System.out.print(arr[i][right]+" ");
				}
				right--;
			}
			else if(direction == 3) {
				for(int i=right; i>=left; i--) {
					System.out.print(arr[top][i]+" ");
				}
				top++;
			}System.out.println();
			direction = (direction + 1) % 4;
		}
	}
}

