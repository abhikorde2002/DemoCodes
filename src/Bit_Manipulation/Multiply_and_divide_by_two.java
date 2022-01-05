package Bit_Manipulation;

import java.util.Scanner;

public class Multiply_and_divide_by_two {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt() ;
        int multiply = num << 1 ;
        int divide = num >> 1 ;

        System.out.println("multiplication by two is : " + multiply );
        System.out.println("divide by two is : " + divide );
    }
}
