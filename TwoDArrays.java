import java.util.*;
// 2d arrays 
public class TwoDArrays 
{
    public static void main(String args[])   
    {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();

       int[][] Numbers = new int[rows][cols];

         // input

         for(int i=0; i<rows; i++)
         {
            for(int j=0; j<cols; j++)
            {
                Numbers[i][j] = sc.nextInt();
            }
         }

            // output
            for(int i=0; i<rows; i++)
            {
                for(int j=0; j<cols; j++)
                {
                    System.out.print(Numbers[i][j] + " ");
                }
                System.out.println();
            }
    }

    
}
