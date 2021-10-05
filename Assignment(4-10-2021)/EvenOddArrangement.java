public class EvenOddArrangement {
    public static void main(String[] args) {
        int a[]={4,2,7,3,6,4,9,4,7,9};

        int arrngement[]=new int[a.length];

        int a1=0;
        for (int i = 0; i < a.length; i++) {
            
            if (a[i]%2==0) {
                arrngement[a1]=a[i];
                a1++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2!=0) {
                arrngement[a1]=a[i];
                a1++;
            }
        }

        for (int i = 0; i < arrngement.length; i++) {
            System.out.print(arrngement[i]+",");
        }

    }
}
