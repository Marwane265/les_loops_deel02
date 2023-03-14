package be.intec.brussel.ochtend;

public class TypeCastIt {
    public static void main(String[] args) {

        //wat is typecasting

        //Widening casting -> automatisch
        //byte -> short -> int -> long -> float -> double
        int number01 = 5;
        double number02 = 0;

        number02 = number01;
        System.out.println(number02);

        //Narrowing casting -> manueel
        double num10 = 19.75;
        int num05 = 0;
        //verlies van data
        num05 = (int) num10;
        System.out.println(num05);

        //is niet mogelijk.
        boolean myBoo=true;
        char ch='a';
//        myBoo=(boolean)ch;

        num10=ch;
        System.out.println(num10);

    }
}
