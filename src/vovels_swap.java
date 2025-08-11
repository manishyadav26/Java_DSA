public class vovels_swap {
    public static void main(String[] args) {
        String s = "Leetcode";

        System.out.println("original String:"+s);
        System.out.println("Reversed:" + reversed(s));

    }

    private static String reversed(String s) {
        char[] chars = s.toCharArray();
        int st =0;
        int end = chars.length-1;
            while (st < end) {
                while (st < end && !isVowel(chars[st])) {
                    st++;
                }
                while (st < end && !isVowel(chars[end])) {
                    end--;
                }

                // Swap the vowels
                char temp = chars[st];
                chars[st] = chars[end];
                chars[end] = temp;

                st++;
                end--;
            }

            return new String(chars);

        }



    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

    }
}
