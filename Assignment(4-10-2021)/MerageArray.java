public class MerageArray {
    public static void main(String[] args) {
        int a1[]={4,5,6,7,8,9};
        int a2[]={1,2,3,4};

        int merge[]=new int[a1.length+a2.length];
        int point=0;
        for (int i = 0; i < a2.length; i++) {
            merge[point]=a2[i];
            point++;
        }
        for (int i = 0; i < a1.length; i++) {
            merge[point]=a1[i];
            point++;
        }

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i]+",");
        }
    }
}
