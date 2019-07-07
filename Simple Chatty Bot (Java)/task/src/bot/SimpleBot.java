package bot;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleBot {
    public  static  void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hello! My name is Aid.\n" +
                "I was created in 2018.\n" +
                "Please, remind me your name.");
        String n=scanner.nextLine();
        System.out.println("What a great name you have, "+n+'!'+"\nLet me guess your age.\n"+"Say me remainders of dividing your age by 3, 5 and 7.");
        int a=scanner.nextInt(),b=scanner.nextInt(),c=scanner.nextInt();

        int age=(a * 70 + b  * 21 + c * 15) % 105;
        System.out.println("Your age is "+age+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int k=scanner.nextInt();
      for(int i=0;i<=k;i++)
      {
          System.out.println(i+""+'!');
      }
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        while(!doTest())
        {
            System.out.println("Please, try again.");
        }
        System.out.println("Congratulations, have a nice day!");
    }
    private static boolean doTest()
    {
        Scanner scanner= new Scanner(System.in);

        int t=scanner.nextInt();
       return t==2;

    }

}
