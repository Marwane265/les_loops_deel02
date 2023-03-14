package be.intec.brussel.ochtend;

import java.util.Scanner;

public class WhileChar {
    public static void main(String[] args) {


        // ik wil alle klinkers tellen in een string
        //met invoer van gebruiker


        //input(string)

        Scanner scanner = new Scanner(System.in);


        //message(input)
        System.out.println("Enter a String: ");
        String name = scanner.nextLine();

        int index = 0;
        int counter = 0;

        //loop -> while

        while (index < name.length()) {
            char ch = name.toLowerCase().charAt(index);


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counter++
                ;

            }
            index++;

        }
        System.out.println("Number of vowels in the string: " + counter);

        //ouput(hoeveel klinkers)


    }
}
