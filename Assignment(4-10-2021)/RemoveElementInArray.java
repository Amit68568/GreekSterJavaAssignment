public class RemoveElementInArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5,7};
        int k=5;
        int a2[]=new int[a.length-1];
        int b=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=5){
                a2[b]=a[i];
                b++;
            }
        }
for (int i = 0; i < a2.length; i++) {
    System.out.print(a2[i]+" ");
  
}


    }
}
