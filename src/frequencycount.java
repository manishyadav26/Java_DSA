import java.io.*;
import java.util.*;

public class frequencycount {
    public static void main(String [] args){
        HashMap <Character,Integer> map= new HashMap<>();

        String s = "abacbcd";

        int [] arr= new int[26];
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]=arr[idx]+1;
        }
        System.out.println(Arrays.toString(arr));
    }

}
