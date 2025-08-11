public class missing_No {
    public static void main(String [] args){
        int [] arr ={3,1,2,5};
        int n=5;

        int sum =0;
        for (int i =0; i<arr.length;i++){
            sum  += arr[i];
        }
        int new_sum = n*(n+1)/2;
        int missing= new_sum-sum;

        System.out.println("Missing number : " +missing);
    }
}
