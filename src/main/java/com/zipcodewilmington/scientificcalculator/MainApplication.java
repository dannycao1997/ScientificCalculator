package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */


import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("\n" +
                "          _______  _        _______  _______  _______  _______ _________ _______  _______ \n" +
                "|\\     /|(  ____ \\( (    /|(  ___  )(  ____ \\(  ____ )(  ___  )\\__   __/(  ____ \\(  ____ \\\n" +
                "( \\   / )| (    \\/|  \\  ( || (   ) || (    \\/| (    )|| (   ) |   ) (   | (    \\/| (    \\/\n" +
                " \\ (_) / | (__    |   \\ | || |   | || |      | (____)|| (___) |   | |   | (__    | (_____ \n" +
                "  ) _ (  |  __)   | (\\ \\) || |   | || |      |     __)|  ___  |   | |   |  __)   (_____  )\n" +
                " / ( ) \\ | (      | | \\   || |   | || |      | (\\ (   | (   ) |   | |   | (            ) |\n" +
                "( /   \\ )| (____/\\| )  \\  || (___) || (____/\\| ) \\ \\__| )   ( |   | |   | (____/\\/\\____) |\n" +
                "|/     \\|(_______/|/    )_)(_______)(_______/|/   \\__/|/     \\|   )_(   (_______/\\_______)\n" +
                "                                                                                          \n");
        Console.println("Welcome to our calculator!");

        Calculator calculator = new Calculator();
        Scientific scientific = new Scientific();
        Console.println("\n%s\n", scientific.getCon());
        Console.println("\n%s\n", calculator.getCurrentValue());
        int userInput;
        String stringInput;
        while (true) {

            Console.println("1.) Clear Display");
            Console.println("2.) Change Current Value");
            Console.println("3.) Addition");
            Console.println("4.) Subtraction");
            Console.println("5.) Multiplication");
            Console.println("6.) Division");
            Console.println("7.) Square");
            Console.println("8.) Square Root");
            Console.println("9.) Exponential");
            Console.println("10.) Inverse");
            Console.println("11.) Invert Signs");
            Console.println("12.) Scientific Calc");



            // other operations
            Console.println("13.) Exit");

            userInput = Console.getIntegerInput("Please select from the following options: ");
            switch (userInput) {
                case 1:
                    // case for Clear screen
                    calculator.setCurrentValue(0);
                    //Console.println("\n%s\n", calculator.getCurrentValue());
                    break;
                case 2:
                    // Change current value
                    double newValue = Console.getDoubleInput("Please enter new value: ");
                    calculator.setCurrentValue(newValue);
                    break;
                case 3:
                    // for addition
                    double number = Console.getDoubleInput("Enter a value to add: ");
                    calculator.add(number);
                    break;
                case 4:
                    // for subtraction
                    double number1 = Console.getDoubleInput("Enter a value to subtract: ");
                    calculator.sub(number1);
                    break;
                case 5:
                    // for multiplication
                    double number2 = Console.getDoubleInput("Enter a value to multiply: ");
                    calculator.multiply(number2);
                    break;
                case 6:
                    // for division
                    double number3 = Console.getDoubleInput("Enter a value to divide: ");
                    calculator.divide(number3);
                    break;
                case 7:
                    // to find square of a number
                    calculator.square();
                    break;
                case 8:
                    // for square root
                    calculator.squareRoot();
                    break;

                case 9:
                    // for exponential
                    double number6 = Console.getDoubleInput("Enter a value of exponent: ");
                    calculator.exponential(number6);
                    break;

                case 10:
                    // for inverse of a number
                    calculator.inverse();
                    break;
                case 11:
                    // for invert signs
                    calculator.invertSign();
                    break;

                case 12:
                    while (true) {
                        stringInput = Console.getStringInput("Sci");
                        switch (stringInput) {
                            case "Display":
                                stringInput = Console.getStringInput("To change display type enter: \"Bin\", \"Oct\", \"Dec\", or \"Hex\"");

                                switch (stringInput) {
                                    case "Bin":
                                        //binary conversion here
                                        int num1 = Console.getIntegerInput("Enter a value of exponent: ");
                                        System.out.println(scientific.binCon(num1));
                                        break;

                                    case "Oct":
                                        //octal conversion
                                        int num2 = Console.getIntegerInput("Enter a value of exponent: ");
                                        System.out.println(scientific.octCon(num2));
                                        break;

                                    case "Dec":
                                        //decimal conversion
                                        int num3 = Console.getIntegerInput("Enter a value of exponent: ");
                                        System.out.println(scientific.decCon(num3));
                                        break;

                                    case "Hex":
                                        // hexadecimal conversion
                                        int num4 = Console.getIntegerInput("Enter a value of exponent: ");
                                        System.out.println(scientific.hexCon());
                                        break;
                                    default:
                                        Console.println("Invalid entry try again");
                                }
                            case "Trig":
                                stringInput = Console.getStringInput("Please select from the following options: ");
                                switch (stringInput) {
                                    case "sin":
                                        scientific.getSine();
                                        break;

                                    case "cos":
                                        scientific.getCosine();
                                        break;

                                    case "tan":
                                        scientific.getTangent();

                                        break;

                                    case "asin":
                                        scientific.getInsine();

                                        break;

                                    case "acos":
                                        scientific.getIncosine();

                                        break;

                                    case "atan":
                                        scientific.getIntangent();

                                        break;

                                    default:
                                        Console.println("Invalid entry try again");
                                }


                        }
                    }
                case 13:
                    //save to memory
                    double file = Console.getDoubleInput("Enter a value to divide: ");
                            scientific.setSave(file);
                    break;


                case 14:
                    // to exit
                    System.exit(0);
                default:
                    Console.println("Invalid entry try again");

            }
            Console.println("\n%s\n", calculator.getCurrentValue());


        }
    }
}


/*public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
}
*/