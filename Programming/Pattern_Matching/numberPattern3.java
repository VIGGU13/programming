public class numberPattern3 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(count<10){
                    System.out.print("0"+count+" ");
                    count++;
                }else{
                   System.out.print(count+" ");
                   count++;
            }
        }
            System.out.println();
        }
    }
}
