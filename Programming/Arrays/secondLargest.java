public class secondLargest {
    public static void main(String[] args) {
        int[] arr={1,8,32,8,32,22};
        int max=arr[0];
        int min=arr[1];
        if(max>min){
            max=arr[0];
            min=arr[1];
        }else{
            max=arr[1];
            min=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                min=max;
                max=arr[i];
            }else if (arr[i]>min&&arr[i]!=max) {

                min=arr[i];
            }
        }
        System.out.println("Second Largest element is: "+min);
    }
}
