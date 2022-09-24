import java.util.Scanner;

/*
Write a program that reads a word and prints the number of vowels in the
word. For this exercise, assume that a e i o u y are vowels. For example, if the
user provides the input "Harry", the program prints 2 vowels
 */
public class q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word :");
        String word=in.next();

        int num=0;
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == 'o'  )
                num++;
            if (word.charAt(i) == 'e'  )
                num++;
            if (word.charAt(i) == 'i'  )
                num++;
            if (word.charAt(i) == 'a'  )
                num++;
            if (word.charAt(i) == 'y'  )
                num++;
            if (word.charAt(i) == 'u'  )
                num++;
        }
        System.out.println("the number of vowels in the word :" + num);
    }
}
