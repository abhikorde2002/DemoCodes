import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 20, 1, 64, 1, 47, 45, 4, 20};
        Scanner in = new Scanner(System.in);
        System.out.println("enter the key : ");
        int key = in.nextInt();
        Arrays.sort(arr);
        int index = binarySearch(arr,key);
        System.out.println((index < 0) ? "key not found" : key + " found at index " + index);
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = ((low + high) / 2) + 1;
            if (key == arr[mid])
                return mid;
            else if (key > arr[mid]) {
                low = mid - 1;
                // mid = (low + high) / 2;
            } else {
                high = mid + 1;
                //  mid = (low + high) / 2;
            }
        }
        return -1;
    }
}
