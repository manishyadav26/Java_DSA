import java.util. Scanner;
public class nTh_primeNo {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to compute the nth prime number: ");
        int n = sc.nextInt();
        int num, count, i;
        num=1;
        count=0;

        while (count < n){
            num=num+1;
            for (i = 2; i <= num; i++){
                if (num % i == 0) {
                    break;
                }
            }
            if ( i == num){
                count = count+1;
            }
        }
        System.out.println("Value of nth prime: " + num);
    }
}
