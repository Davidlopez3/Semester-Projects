import java.util.Scanner;
public class Cipher {

public static void main(String[] args) {

    // declare vowls
    int vowls =0;
    // declare constant
    int constant =0;
    // request user input
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter phrase");
    String code = input.nextLine();
    //System.out.println("Your code is " + decrypt method );


    // method booleam encrypt
   public static String enc(String code ){
        // if request user input divisible % by 5
        if (code % 5 == 0)
            // Print yes iif no is divisible by 5
            //print Vowels: A E I O U Y
            String[] vowls = {"A", "E", "I", "O", "U", "Y"}
        else
            // Print no if no is not divisible by 5
            //else print constant rest of the alphhabeth
            String constant = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", " Z"};

        // return arrays(vowls,constant)
    }


    //method to decrtypt method
    // x + y = Print
    // return print




}








}