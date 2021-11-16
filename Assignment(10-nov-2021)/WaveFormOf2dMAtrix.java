public class WaveFormOf2dMAtrix {
  
        public static void main(String[] args) {
            
            int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
            int top = 0, bottom = 2, left = 0, right = 2;
            int direction = 0;
            while(left<=right) {
                if(direction == 0) {
                    for(int i=top; i<=bottom; i++) {
                        System.out.print(arr[i][left]+" ");
                    }
                    left++;
                }
                else if(direction == 1) {
                    for(int i=bottom; i>=top; i--) {
                        System.out.print(arr[i][left]+" ");
                    }
                    left++;
                }
                System.out.println();
                direction = (direction+1)%2;
            }
        }
    
    
}
