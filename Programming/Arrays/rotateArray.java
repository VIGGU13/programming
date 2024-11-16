public class rotateArray {
    public static void main(String[] args) {
        int k=-1;
        int[] arr={10,21,32,11,2333,11};
        rotate(arr,k);

        System.out.println("Array after rotation is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void rotate(int[] arr,int k){
        k=k%arr.length-1;
        if(k<0){
            k=k+arr.length-1;
        }
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
