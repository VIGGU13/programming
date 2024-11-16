public class largestElement{
    public static void main(String[] args) {
        int arr[]={10,21,1,21,12,91};
       int largest=0;
    for(int i=0;i<arr.length;i++){
          if(arr[i]>largest){
            largest=arr[i];
          }
           }
           System.out.println("Largest element is: "+largest);
      
        }
    }
    

