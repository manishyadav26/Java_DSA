public class Str_permutation {
    public static void main(String [] args){
        String s="abc";
        print(s,"");
    }
    public static void print(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i =0; i<s.length();i++){
             char ch = s.charAt(i);

            String str = s.substring(0, i) + s.substring(i + 1);

            print(str,ans+ch);
        }
    }
}
