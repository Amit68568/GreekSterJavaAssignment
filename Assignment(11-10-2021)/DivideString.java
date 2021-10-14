public class DivideString {
    public static void main(String[] args) {
        String s="aaaabbbbcccc";
        int a=4;
       


        for (int i = 0; i < s.length(); i++) {
            
            System.out.print(s.charAt(i));
            if((i+1)%a==0){
                System.out.println();
            }
        }
    }
}
