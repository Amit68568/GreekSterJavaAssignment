public class AddingArraysElementByRecusion {
    public static void main(String[] args) {
        int []a={1,2,5,5,10};
        int l=a.length;
        int b=addingElement(a,l);
        System.out.println(b);
    }

    private static int addingElement(int[] a1, int l) {
        if(l==0) return 0;

        return (addingElement(a1, l - 1) + a1[l - 1]);
    }
}
