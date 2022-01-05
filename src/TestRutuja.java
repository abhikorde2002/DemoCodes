import java.util.Scanner;

public class TestRutuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int totalSize = size1 + size2;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[totalSize];
        int j = 0;
        int k = 0;
        for (int i = 0; i < totalSize; i++) {
            if (totalSize %2 == 0){
                arr3[i] = arr1[j];
                j++;
            }
            else{
                arr3[i] = arr2[k];
                k++;
            }
        }

        for (int i = 0; i < totalSize; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
