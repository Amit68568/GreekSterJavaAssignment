import java.util.Scanner;

public class MinNoInArrary {
public static void main(String[] args) {
    MinArray();
}

public static void MinArray(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the five number");
    int array[]=new int[5];
    

    for (int i = 0; i < array.length; i++) {
        array[i]=sc.nextInt();
    }
    int min=array[0];
    for(int j=0;j<array.length;j++){
        if(array[j]<min){
            min=array[j];
        }
    }

    System.out.println("The minimum no. in arrary is "+min);
}
    
}