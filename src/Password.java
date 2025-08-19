import java.util.Scanner;
public class Password {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first input:");
        int num1 = sc.nextInt();
        System.out.print("enetr the second input:");
        int num2 = sc.nextInt();
        System.out.print("enter the third input:");
        int num3= sc.nextInt();

        int u1 = num1%10, u2=num2%10, u3=num3%10;
        int t1=(num1/10)%10, t2=(num2/10)%10, t3=(num3/10)%10;
        int h1=(num1/100)%10, h2=(num2/100)%10, h3=(num3/100)%10;

        int unit = Math.min(u1, Math.min(u2,u3));
        int tens= Math.min(t1,Math.min(t2,t3));
        int hundred = Math.min(h1, Math.min(h2,h3));

        int maxDigit=0;
        int[] num = {num1, num2, num3};
        for(int i : num){
            int temp=i;
            while(temp > 0){
                int digit = temp%10;
                if(digit > maxDigit){
                    maxDigit=digit;
                }
                temp /= 10;
            }
        }
        int PIN = maxDigit*1000+ hundred*100 + tens*10 + unit;
        System.out.println("The password is :" +PIN);

    }
}
