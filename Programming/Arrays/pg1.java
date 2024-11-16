public class pg1 {
    public static void main(String[] args) {
        int[] arr={10,22,0,12,0,33,0};
        moveZeroEnd(arr);

        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void moveZeroEnd(int[] arr){
        int nz=0,z=0;
        while(nz<arr.length){
             if(arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
             }else{
                nz++;
             }
           
        }
    }
}
