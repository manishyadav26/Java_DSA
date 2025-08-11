public class BinarySearch {

        int binarySearch(int arr[], int x){
        
        int st=0;
        int end=arr.length-1;
        
        while( st <= end){
            int mid = st+(end-st)/2;
            
            if(arr[mid]==x)
                return mid;
            else if (arr[mid]< x)
                st=mid+1;
            else
                end=mid-1;
            }
        return -1;

        }
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40,50,56 };
        int n = arr.length;
        int x = 50;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
    }

