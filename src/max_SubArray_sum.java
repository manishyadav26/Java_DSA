public class max_SubArray_sum {
    public  static  void main(String [] args){
        int [] arr={1,2,3,4};
        int max=0;
        for(int i =0; i<arr.length;i++)
            for(int j =i; j<arr.length; j++){
                int sum =0;
                for(int k=i; k<=j;k++){
                    System.out.print(arr[k] + "");
                    sum= sum + arr[k];
                }
                max=Math.max(sum,max);
                System.out.println(" sum = "+ sum);

            }
        System.out.println(max);
    }
}
