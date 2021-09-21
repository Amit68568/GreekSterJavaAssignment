import java.util.Scanner;



public class SearchNoInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find");
        int n=sc.nextInt();
        
        boolean b=false;
        int a[]={4,6,8,33,57,24,7,87,12,9,122};
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
               System.out.println("The number is present at "+i);
               b=true;
               break;
            
            }
        }
        if(b==false){
            System.out.println("The number is not present ");
        }

        
    }
}
