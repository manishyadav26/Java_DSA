public class sum_Index {
    public static void main(String[] args){
        int [] arr = {1,8,0,2,3,5,6};
        //for odd
        int ss = secSmallest(arr);
        System.out.println(ss);

        //for even
       int sg = secGreatest(arr);
        System.out.println(sg);

        System.out.println(ss+sg);

    }
    private static int secGreatest(int[] arr){
        int fg = Integer.MIN_VALUE;
        int sg =  fg;
        for(int i =0;i<arr.length;i=i+2){
            if(arr[i]>fg){
                sg=fg;
                fg=arr[i];
            }
            else if(arr[i]>sg){
                sg=arr[i];
            }
        }
        return sg;
    }
    private static int secSmallest(int [] arr){
        int fs = Integer.MAX_VALUE;
        int ss = fs;
        for(int i =1; i<arr.length;i=i+2){
            if(arr[i]<fs){
                ss=fs;
                fs=arr[i];
            }
            else if(arr[i]<ss){
                ss=arr[i];
            }
        }
        return ss;
    }
}
