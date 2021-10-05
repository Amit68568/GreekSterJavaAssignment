

public class AverageWithArray {
    public static void main(String[] args) {
        int []a={1,2,3,5,9,14,19,4,6};
        double avg=0;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }

        avg=sum/a.length;
        System.out.println("The average = "+avg);


    }
}
