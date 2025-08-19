import java.util.Scanner;
public class weightOfHill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the no. of levels:");
        int m = sc.nextInt();
        System.out.print("enter the weight value of head:");
        int l = sc.nextInt();
        System.out.print("enter the weight increase at subsequent level:");
        int n= sc.nextInt();
        int sum =0;
        for(int i=0; i<=m;i++){
            sum += (l+(i-1)*n)*i;
        }
        System.out.println("Total weight" +sum);
    }
}
