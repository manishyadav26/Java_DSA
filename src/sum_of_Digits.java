public class sum_of_Digits {
    public static void main(String[] args){
        int [] arr = {12,14,16,9,8,10,24,5,4,3};
        int sum=0;
        int max=0;
        for(int i =0; i<arr.length;i++){
            //for(int j=i;j<arr.length;j++){
                sum=sum+arr[i];
                //System.out.println(sum);
           // }
        }
        max=Math.max(max,sum);
        System.out.println(max);


        int  digitsum=0;

        for (int digit : arr) {
            int currentSum=0;
           // int[] tempSum = arr;

            while(digit != 0){
                currentSum += digit%10;
                digit= digit/10;
            }
             digitsum += currentSum ;

        }
        System.out.println(digitsum);

        System.out.println(max-digitsum);

    }


}
