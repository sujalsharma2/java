import java.util.*;
public class IfElse {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
       /*  int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("You are an adult.");
        }
        else
        {
            System.out.println("You are a minor.");
        }*/
       /*  int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        */
       /*
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       if (a == b ) {
           System.out.println("Equal");
       } else if (a > b) {
           System.out.println("Greater");
       } else {
           System.out.println("Smaller");
       }
       */

       switch (sc.nextInt()) {
        case 1:System.out.println("Hello");
        break;
        case 2:System.out.println("Namaste");
        break;
        case 3:System.out.println("bonjour");
        break;
       
        default: System.out.println("Invalid button");
        break;
       }
    }
}
