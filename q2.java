import java.util.Scanner;

/*
Prime numbers. Write a program that prompts the user for an integer and then
prints out all prime numbers up to that integer. For example, when the user
enters 20,
 */
public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter  an integer :");
        int integer=in.nextInt();
        for (int i=0 ; i<=integer ; i++)
        {
            if (i%3 != 0 && i%2 !=0 || i==2 || i==3 )
                System.out.println(i);
        }

    }
}
