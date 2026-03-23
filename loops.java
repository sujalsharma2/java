import java.util.*;
public class loops {
     public static void main(String[] args) {
        
        /*for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }*/

            /*(int i = 0;
            while (i < 11) {
                System.out.println(i);
                i++;
            } */

        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 11); */


        // Q1: print the sum of first n natural numbers

        /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        */
       // Q2: print the Table of a number input by user
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       for (int i = 1; i < 11; i++) {
        System.out.println( n * i);
       }



     }
}
