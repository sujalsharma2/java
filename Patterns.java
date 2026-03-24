public class Patterns {
    public static void main(String[] args) {
       // int n = 4;
       // int m = 5;

        //Outer Loop - controls the number of rows
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

        // Q3: 
       /*  int a = 4;
        for (int i=1; i <= a; i++) 
        {
            for (int j = 1; j <= a - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

            // Q4:   
            
        int n = 5;
        for (int i = 1; i <= n; i++) 
     {
            for (int j = 1; j <= i ; j++)
            {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        
    }
    
}
