public class binaryTodecimal{
public static void main(String[] args) {
    int dec=14;
    String bin="";
    while(dec>0){
        int remainder=dec%2;
        bin=remainder+bin;
        dec=dec/2;

    }
    System.out.println(bin);
}
}