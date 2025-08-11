public class coin_face {
    static int count=0;
    public static void main(String [] args) {
        int n = 3;
        coin_face(n, "", ' ');
        System.out.println(count);

    }
    public static void coin_face(int n , String s, char prev){
        if(n==0) {
            System.out.println(s);
            count++;
            return;
        }
        if(prev != 'H'){
        coin_face(n-1,s+"H ", 'H');}

        coin_face(n-1,s+"T " , 'T');
        }


}
