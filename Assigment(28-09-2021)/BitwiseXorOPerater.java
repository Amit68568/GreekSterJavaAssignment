public class BitwiseXorOPerater {
    public static void main(String[] args) {
        int a[]={2,3,4,4,3};
        int ans=0;

        for (int i = 0; i < a.length; i++) {
            ans=ans^a[i];
        }

        System.out.println("The number is "+ans);
    }
    
}
