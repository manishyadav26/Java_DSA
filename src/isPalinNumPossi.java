import java.util.Scanner;
public class isPalinNumPossi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the no:");
        int n =  sc.nextInt();

        int[] freq = new int[10];
        while(n != 0){
            int digit = n%10;
            freq[digit]++;
            n /= 10;
        }
        int oddCount = 0;
        for(int count : freq){
            if(count % 2 != 0){
                oddCount++;
            }
        }
         if(oddCount <= 1){
             System.out.println("yes");
         }else{
             System.out.println("no");
         }

    }
}
