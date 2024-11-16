public class missingElement {
    
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
            int xor1=0;
            for(int i=0;i<=arr.length+1;i++){
                 xor1=xor1^i;
            }
            int xor2=0;
            for(int j=0;j<=arr.length-1;j++){
                xor2=xor2^arr[j];
            }
           int res= xor1^xor2;
           System.out.println(res);
        }
    }
    
