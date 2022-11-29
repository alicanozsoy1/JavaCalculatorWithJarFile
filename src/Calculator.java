import java.util.InputMismatchException;
import java.util.Scanner;

import static odev.Hesaplamalar.*;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String func=" ";

        System.out.println("""
                \tOPERATIONS\s
                \t1-Add(+)\s
                \t2-Subtract(-)\s
                \t3-Multiply(*)\s
                \t4-Divide(/)\s
                \t5-Sin\s
                \t6-Cos\s
                \t7-Tan\s
                \t8-Power(^)\s
                \t9-Square Root(√)\s
                \t10-Mod(%)\s
                \t0-Exit\s""");

        try {
            while (continue1) {
                System.out.println("Please enter your function(number): ");
                func = sc.next();
                switch (func) {
                    case "1" -> {
                        evenVariable();
                        add(number1, number2);
                    }
                    case "2" -> {
                        evenVariable();
                        subtract(number1, number2);
                    }
                    case "3" -> {
                        evenVariable();
                        multiply(number1, number2);
                    }
                    case "4" -> {
                        evenVariable();
                        divide(number1, number2);
                    }
                    case "5" -> {
                        singleVariable();
                        sin(number1);
                    }
                    case "6" -> {
                        singleVariable();
                        cos(number1);
                    }
                    case "7" -> {
                        singleVariable();
                        tan(number1);
                    }
                    case "8" -> {
                        evenVariable();
                        power(number1, number2);
                    }
                    case "9" -> {
                        singleVariable();
                        squareRoot(number1);
                    }
                    case "10" -> {
                        evenVariable();
                        mod(number1, number2);
                    }
                    case "0" -> exit();
                    default -> undefined();
                }
                continueFunc();
            }
        } catch (InputMismatchException e){
            undefined();
        }

    }
}



