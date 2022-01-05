import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size1 = sc.nextInt();
//        int size2 = sc.nextInt();
//        int totalSize = size1 + size2;
//        int arr1[] = new int[size1];
//        int arr2[] = new int[size2];
//        for (int i = 0; i < size1; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        for (int i = 0; i < size2; i++) {
//            arr2[i] = sc.nextInt();
//        }
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {4,5,6,7,8};
        int[] arr3 = new int[num1.length+num2.length];
        int n1 = num1.length ;
        int n2 = num2.length;
        merge(num1,num2,arr3, n1,n2);

        for (int i = 0; i < num1.length+num2.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }

    static void merge(int arr1[], int[] arr2, int[] arr3, int n1, int n2) {
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }


    }
}
