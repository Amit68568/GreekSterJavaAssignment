import java.util.Scanner;

public class TwoRepeatingElementInArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,5,3};
        int result=0;
        System.out.print("The two repeating Element are =");

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((a[i]^a[j])==0)
                    {   
                        System.out.print(a[i]+" ");
                        result++;
                    }           
           
        }
        if(result==2){
            break;
        }

    }
        
    }
}
