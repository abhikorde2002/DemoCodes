package Bit_Manipulation;

import java.util.Scanner;

public class find_ith_bit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the index of bit you want : ");
        int index = sc.nextInt();

        int mask = 1 << index;

        if ((num & mask) > 0)
            System.out.println("bit at index " + index + " is 1");
        else
            System.out.println("bit at index " + index + " is 0");
    }
}
