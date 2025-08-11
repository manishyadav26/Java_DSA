import java.util.Arrays;

public class Reverse_an_Array {
    public static void main( String [] args){
        int [] arr ={1,2,3,4,5,6};
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
