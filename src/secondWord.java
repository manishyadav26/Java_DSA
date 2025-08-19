import java.util.Scanner;
public class secondWord {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ther string input:");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        if(words.length < 2){
            System.out.println("LESS");
        }
        String secondWord = words[1].toUpperCase();
        System.out.println("secondWord to upper case:" +secondWord);
    }
}
