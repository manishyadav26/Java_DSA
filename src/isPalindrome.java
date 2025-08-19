import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enetr the no.");
       int n = sc.nextInt();

       int originalNum=n;
       int reversedNum=0;

       while(n != 0){
           int digit = n%10;
           reversedNum=reversedNum*10+digit;
           n /= 10;
       }
       if(originalNum == reversedNum){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }

    }
}
