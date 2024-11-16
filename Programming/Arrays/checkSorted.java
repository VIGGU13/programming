public class checkSorted {
    public static void main(String[] args) {
        int[] arr={10,11,12,16,17,21};
        if(checkArray(arr)){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
    public static boolean checkArray(int[] arr){
       
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }   
        }
        return true;
    }
}
