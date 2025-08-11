public class sum_max_subarray {
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int max=0;
        for(int i =0; i<arr.length;i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum = sum+ arr[j];
                System.out.println(sum);
            }
            max=Math.max(max,sum);
        }
        System.out.println(" Max Sum is : "+ max);
    }
}
