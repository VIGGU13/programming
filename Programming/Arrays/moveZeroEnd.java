public class moveZeroEnd {
    public static void  moveZero(int[] arr){
        int nz=0;
        int z=0;
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
    public static void main(String[] args) {
        int[] arr={12,11,0,87,0,43,22,0};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        } 
    }
}
