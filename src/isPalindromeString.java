import java.util.Scanner;
public class isPalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the string:");
        String str= sc.nextLine();

        String str1 = str.toUpperCase();
        int st=0;
        int end=str1.length()-1;
        boolean isPalindrome = true;
        while(st < end){
            if(str.charAt(st) != str.charAt(end)){
                isPalindrome=false;
                break;
            }
            st++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NoPalindrome");
        }
    }
}
