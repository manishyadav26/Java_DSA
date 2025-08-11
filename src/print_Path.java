public class print_Path {
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        System.out.println("possible path if " +  n  + " stairs: ");
        System.out.println(count);
        print_Path(n, "");


    }

    public static void print_Path(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            count++;
            return;
        }
        if (n >= 1) {
            print_Path(n - 1, s + "1 ");

        }
        if (n >= 2) {
            print_Path(n - 2, s + "2 ");
        }
        if (n >= 3) {
            print_Path(n - 3, s + "3 ");

        }
    }
}