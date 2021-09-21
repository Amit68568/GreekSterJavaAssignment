public interface ExchangeNoWith0 {
    public static void main(String[] args) {
        int []arr={23,33,4,3,6,7,2,8,70,23,76,3,463,32};
        int n=76;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                arr[i]=0;
                break;
            }
            
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
    }
    
}
