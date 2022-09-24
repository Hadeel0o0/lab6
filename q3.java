import java.util.Scanner;

/*
Write programs with loops that compute
a. The sum of all even numbers between 2 and 100 (inclusive).
b. The sum of all odd numbers between a and b (inclusive), where a and b are
inputs.
c. The sum of all odd digits of an input. (For example, if the input is 32677,
the sum would be 3 + 7 + 7 = 17.
 */
public class q3 {
    public static void main(String[] args) {

        //****The sum of all even numbers between 2 and 100 (inclusive)./////
        for (int i = 2; i <= 100; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }

        //****The sum of all odd numbers between a and b (inclusive), where a and b ar inputs.////
        Scanner in=new Scanner(System.in);
        System.out.println("Enter tow numbers :");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        for (int i = n1; i <= n2; i++) {
            if(i%2 != 0)
                System.out.println(i);
        }

        //*****The sum of all odd digits of an input. (For example, if the input is 32677,
        //the sum would be 3 + 7 + 7 = 17.//
        System.out.println("Enter number :");
        int number  = in.nextInt();
        int sum=0 , rem;

        while (number!=0)
        {
            rem=number%10;
            if (rem%2 != 0) {
                sum+=rem;
            }
            number=number/10;
        }
        System.out.println(sum);


    }

}
