public class largestElement2 {
    public static void main(String[] args) {
        int[] arr={10,21,3,21,65,13,91};
        int largest=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                 largest=arr[i];
            }else{
                largest=arr[j];
            }
            i++;
            j--;
        }
        System.out.println(largest);

    }
}
