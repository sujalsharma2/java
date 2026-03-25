import java.util.*;

public class FunctionsMethods
{// make a functions and return sum of two integers 
    // public static int calculatedSum(int a, int b) 
    // {
    //     int sum = a + b;
    //     return sum;
    // }
    public static int printFactorial(int n) 
    {
        if (n < 0) 
        {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
        }
       int factorial = 1;
       for (int i = n; i >=1; i--) 
       {
           factorial =factorial * i;
       }
       System.out.println("Factorial: " + factorial);
         return factorial;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculatedSum(a, b);
        // System.out.println("Sum: " + sum);

        int n = sc.nextInt();
        printFactorial(n);




       // int n = 4;
    }       // int m = 5;

}       //Outer Loop - controls the number of rows
       /*  for (int i = 1; i <= n; i++) {
            //Inner Loop - controls the number of columns
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        

        // outer loop 
       /*  for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) 
            {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        // Q1: print the following pattern
        /*
         * *
         * * *
         * * * *
         * * * * *
         */
      /*   for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

         // Q2: print the following pattern
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
       /*   for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } */

         // Q3: print the following pattern
        /*
                 *
               * *
             * * *
           * * * *
         * * * * *
         */
      /*   int n = 5;
        for (int i = 1; i <= n; i++) 
      {
             for (int j = 1; j <= n - i ; j++)
             {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i ; k++)
             {
                 System.out.print("* ");
             }
             System.out.println();
        } */