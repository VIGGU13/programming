public class reverse {

    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int arr[]={10,23,43,21,56,89};
        System.out.print("array before sorting");
        System.out.println();
        for(int i=0;i<arr.length;i++){
            
               System.out.print(arr[i]+ " ");
        }
         
        reverse(arr);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("array after sorting");
        for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+ " ");
        }
    }
}
