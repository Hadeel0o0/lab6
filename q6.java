import java.util.Scanner;

/*
Write a program that reads a word and prints the word in reverse. For
example, if the user provides the input "Harry", the program prints yrraH
 */
public class q6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word :");
        String word=in.next();

        for (int i = word.length()-1 ; i >=0; i--) {
            System.out.println(word.charAt(i));
        }
    }
}
