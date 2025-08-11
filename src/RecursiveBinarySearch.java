public class RecursiveBinarySearch {

    int recursiveBinarysearch(int[] arr, int st, int end, int x) {
        if (st > end)
            return -1;

        int mid = st + (end - st) / 2;

        if (arr[mid] == x)
            return mid;
        else if (arr[mid] > x)
            return recursiveBinarysearch(arr, st, mid - 1, x);
        else
            return recursiveBinarysearch(arr, mid + 1, end, x);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int x = 5;

        RecursiveBinarySearch obj = new RecursiveBinarySearch();
        int result = obj.recursiveBinarysearch(arr, 0, arr.length - 1, x);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
