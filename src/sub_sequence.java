public class sub_sequence {
    public static void main(String [] args){
        String s ="abc";
        int n=s.length();
        int all=1<<n;


        for(int i=0 ; i<all;i++){
            String subsequence = "";
            for(int j =0; j<n; j++){
                if((i&(1<<j)) !=0){
                    subsequence += s.charAt(j);
                }
            }
            System.out.println(subsequence);
        }
    }
}


