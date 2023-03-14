package be.intec.brussel.ochtend;

import java.util.Random;
import java.util.Scanner;

public class RandomFor {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner= new Scanner(System.in);

        //input
        System.out.println("Enter a number");
        int max = scanner.nextInt();


        for (
                int fiets = 0; fiets < max; fiets++

        ) {
            int randomnum = random.nextInt(1000);
            //output
            System.out.println("Fiets number: " + (fiets) + " randomnummer" + randomnum);
        }


    }
}
