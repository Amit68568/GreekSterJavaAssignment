public class VowelsAndConstonent {
    public static void main(String[] args) {
        String s="This is really a simple #%^&()question";
        s=s.toLowerCase();
        s=s.replace(" ", "");
        int consto=0;
        int vow=0;
        int sim=0;
        
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'){
                vow++;
            }else{
                consto++;
            }
        
        }else{
            sim++;

        }
    }
        System.out.println(consto);
        System.out.println(vow);
        System.out.println(sim);
        
    }
}
