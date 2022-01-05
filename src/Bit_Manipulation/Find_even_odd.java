package Bit_Manipulation;

import java.util.Scanner;

public class Find_even_odd {
    public static void main(String[] args) {
      //  while (true) {
            System.out.print("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if ((num & 1) == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
 //   }
}
