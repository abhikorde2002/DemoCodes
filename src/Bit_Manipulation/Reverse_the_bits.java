package Bit_Manipulation;

import java.util.Scanner;

public class Reverse_the_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        long reverse = reverseBits(num);
        System.out.println("The reverse of bits of " + num + " is " + reverse);
    }

    static long reverseBits(int num) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((num & (1 << i)) != 0)
                rev = rev | 1;
        }
        return rev;
    }
}
