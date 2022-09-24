import java.util.Scanner;

/*
Write a program that reads a word and prints each character of the word on a
separate line. For example, if the user provides the input "Harry", the program
prints
H
A
R
R
Y
 */
public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word :");
        String word=in.next();

        for (int i = 0; i <word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
