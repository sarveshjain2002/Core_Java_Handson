
import java.util.Scanner;

public class Chk_W_Num_Odd_Even_07 {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
    }
}
// import java.util.Scanner;

// public class EvenOdd {

//     public static void main(String[] args) {

//         Scanner reader = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = reader.nextInt();

//         if(num % 2 == 0)
//             System.out.println(num + " is even");
//         else
//             System.out.println(num + " is odd");
//     }
// }