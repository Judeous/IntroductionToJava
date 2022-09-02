
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/**
 *
 * @author Jude
 */
public class IntroductionToJava {

    public static void main(String[] args) {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Key: ");
            System.out.println("-1: Quit");
            System.out.println("0:  Lab 2 (Compute Expression)");
            System.out.println("1:  Lab 2 (Fix Logic Errors)");
            System.out.println("2:  Lab 2 (Fix Runtime Errors)");
            System.out.println("3:  Lab 2 (Fix Syntax Errors)\n");
            System.out.println("4:  Lab 3 (Population Change Calculator)");
            System.out.println("5:  Lab 3 (Painting a Wall)");
            System.out.println("6:  Lab 3 (Miles to Kilometers)");
            System.out.println("7:  Lab 3 (Runway Length)\n");
            System.out.println("8:  Lab 4 (Seconds to Minutes)");
            System.out.println("9:  Lab 4 (Payroll Calculator)");
            System.out.println("10: Lab 4 (Ints versus Doubles)\n");
            System.out.println("11: Lab 5 (Casting)");
            System.out.println("12: Lab 5 (Powers)\n");
            System.out.println("13: MP1 (Savings)");
            System.out.println("14: MP1 (Cylinder Area Calculator)");
            System.out.println("15: MP1 (Minutes to Years)");
            System.out.println("16: MP1 (Sum of Digits)");
            System.out.println("17: MP1 (Wind Chill Index)");
            System.out.println("Select which program you'd like to try; above is a key");
            int input = scanner.nextInt();
            quit = input == -1;
            if (input > 17 || input < -1) {
                System.out.println("I'm not sure what you're expecting from this.");
            } else {
                DoProgram(scanner, input);
            }
        } while (!quit);
    }

    private static void DoProgram(Scanner scanner, int selectedProgram) {
        switch (selectedProgram) {
            case 0: //Compute Expression
                System.out.print("(10.5 + 2 * 3) / (45 – 3.5) = ");
                System.out.println((10.5 + 2 * 3) / (45 - 3.5));
                break;
            case 1: //Fix Logic Errors
                int Celsius = 35;
                System.out.print("Celsius " + Celsius + " is Fahrenheit degree ");
                System.out.println((9.0 / 5.0) * Celsius + 32);
                break;
            case 2: //Fix Runtime Errors
                System.out.println(1.0 / 2.0);
                break;
            case 3: //Fix Syntax Errors
                System.out.println("Welcome to Java");
                break;
            case 4: //Population Change
                int current = 312032486;

                System.out.println("How many years do you want to simulate?");
                int populationChangeYears = scanner.nextInt();

                current = ChangeOverYear(current);
                System.out.println("After the first year, the population is " + current);
                for (int i = 2; i <= populationChangeYears; i++) {
                    current = ChangeOverYear(current);
                    System.out.println("After " + i + " years, the population is " + current);
                }
                break;
            case 5: //Painting a Wall
                System.out.println("Enter the height of the wall");
                double height = scanner.nextDouble();
                System.out.println("Enter the width of the wall");
                double width = scanner.nextDouble();
                double paintWallArea = width * height;
                System.out.println("Testing area: " + paintWallArea);
                final double GALLONS_PER_SQUARE_FEET = 150.0;
                double gallons = paintWallArea / GALLONS_PER_SQUARE_FEET;
                System.out.println("The amount of paint is " + gallons + " gallons.");
                break;
            case 6: //Miles to Kilometers
                System.out.println("What is your name?");
                String userName = scanner.nextLine();

                //Promp the user to enter the number of miles
                System.out.println("Alright, " + userName + ", how many miles do you want to convert to kilometers?");
                //Read and store miles
                double miles;
                miles = scanner.nextDouble();

                //Calculate the Kilometer conversion
                double kilometers = miles * 1.6;
                //Print out results
                System.out.println(miles + " miles is " + kilometers + " kilometers.");
                break;
            case 7: //Runway Length
                System.out.println("Enter the Acceleration of the plane");
                double acceleration = scanner.nextDouble();
                System.out.println("Enter the Speed needed to take off");
                double goalSpeed = scanner.nextDouble();
                double runwayLength = (goalSpeed * goalSpeed) / (2 * acceleration);
                System.out.println("The minimum length of a runway needed for the plane to take off would be " + runwayLength);
                break;
            case 8: //Seconds to Minutes
                // Prompt the user for input
                System.out.print("Enter the number of seconds to convert to minutes: ");
                int seconds = scanner.nextInt();

                int minutes = seconds / 60; // Find minutes in seconds
                int remainingSeconds = seconds % 60; // Seconds remaining
                System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
                break;
            case 9: //Payroll Calculator
                System.out.print("Enter employee's name: ");
                String employeeName = scanner.nextLine();
                System.out.print("\n Enter number of hours worked in a week: ");
                double hours = scanner.nextDouble();
                System.out.print("\nEnter hourly pay rate: ");
                double payRate = scanner.nextDouble();
                System.out.print("\nEnter federal tax withholding rate: ");
                double fedTax = scanner.nextDouble();
                System.out.print("\nEnter state tax withholding rate: ");
                double stateTax = scanner.nextDouble();

                double deservedPay = hours * payRate;
                double fedHaul = (fedTax * deservedPay);
                double stateHaul = (stateTax * deservedPay);

                double totalTax = fedHaul + stateHaul;
                double totalPay = deservedPay - totalTax;

                System.out.println("\n\nEmployee Name: " + employeeName);
                System.out.println("\nHours Worked: " + hours);
                System.out.println("\nPay Rate: $" + payRate);
                System.out.println("\nPay Rate: $" + payRate);
                System.out.println("\nGross Pay: $" + deservedPay);
                System.out.println("\nDeductions:");
                System.out.println("\n   Federal Witholding: (" + fedTax + "%): $" + fedHaul);
                System.out.println("\n   State Witholding: (" + stateTax + "%): $" + stateHaul);
                System.out.println("Total minus Deductions: $" + totalPay);
                break;
            case 10: //Ints versus Doubles
                int integer = 4;
                double x = 4.0;

                for (int iterator = 1; iterator < 9; iterator++) {
                    System.out.println(integer + " / " + iterator + " = " + (integer / iterator));
                }

                for (int iterator = 1; iterator < 9; iterator++) {
                    System.out.println(x + " / " + iterator + " = " + (x / iterator));
                }
                break;
            case 11: //Casting
                int castX = 8;
                int y = 15;
                double d = 2;

                //Increment castX by 2
                castX += 2;
                //Increment y by 5 using the += operator
                y += 5;

                //Increment d by 1 using the ++ operator
                d++;

                //Print 1.5 instead of 0
                double z1 = ((double) castX / y) * d++;
                System.out.println(z1);

                //print 2.5 instead of 0
                double z2 = ((double) castX / y) * ++d;

                //Declare z3 and modify the right hand side of 
                //the previous expression to make it evaluate to 2.0
                double z3 = (int) ((double) castX / y * d);

                System.out.println(z3);
                System.out.println("x=" + castX + " y=" + y + " d=" + d
                        + " z1=" + z1 + " z2=" + z2 + " z3=" + z3);
                break;

            case 12: //Powers
                System.out.println("Input two numbers. The first number will be raised to the power of the second number,"
                        + " then the second number will be raised to the power of the first.");
                double num = scanner.nextDouble();
                double num1 = scanner.nextDouble();
                System.out.println("First number: " + num + ". Second number: " + num1);
                System.out.println(num + "^" + num1 + " = " + Math.pow(num, num1));
                System.out.println(num1 + "^" + num + " = " + Math.pow(num1, num));
                break;
            case 13: //Savings
                System.out.println("Enter monthly saving amount: ");
                double monthlySaving = scanner.nextDouble();

                System.out.println("How many months do you save for?");
                int months = scanner.nextInt();

                double currentSaving = monthlySaving * (1 + 0.00417);
                System.out.println("After the first month, the account value is " + currentSaving);

                for (int i = 2; i <= months; i++) {
                    currentSaving = (monthlySaving + currentSaving) * (1 + 0.00417);
                    System.out.println("After " + i + " months, the account value is " + currentSaving);
                }
                break;
            case 14: //Cylinder Area Calculator

                //Enter radius of the cylinder
                System.out.println("Enter the radius and length of a cylinder: ");
                double radius = scanner.nextDouble();
                double length = scanner.nextDouble();

                //Compute area and volume
                double cylinderArea = radius * radius * 3.14159;
                double volume = cylinderArea * length;

                //Display result
                System.out.println("The area is " + cylinderArea);
                System.out.println("The volume of the cylinder is " + volume);
                break;
            case 15: //Minutes to Years
                System.out.println("Enter the number of minutes: ");
                int minutesToYears = scanner.nextInt();
                int days = minutesToYears / 1440;
                int yearsFromMinutes = days / 365;
                days -= yearsFromMinutes * 365;

                if (days == 0 && yearsFromMinutes == 0) {
                    System.out.println(minutesToYears + " minutes is not a full year nor a full day.");
                } else {
                    System.out.println(minutesToYears + " is approximately " + yearsFromMinutes + " years and " + days + " days.");
                }
                break;
            case 16: //Sum of Digits
                //Read a number
                System.out.println("Enter an integer between 0 and 1000: ");
                int numToGetDigitsOf = scanner.nextInt();

                //Find all digits in the number
                int lastDigit = numToGetDigitsOf % 10;
                int remainingNumber = numToGetDigitsOf / 10;
                int secondLastDigit = remainingNumber % 10;
                remainingNumber = remainingNumber / 10;
                int thirdLastDigit = remainingNumber % 10;

                //Obtain the sum of all digits
                int sum = lastDigit + secondLastDigit + thirdLastDigit;

                //Display results
                System.out.println("The sum of all digits in " + numToGetDigitsOf + " is " + sum);
                break;
            case 17: //Wind Chill Index
                System.out.println("Input the temperature");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Enter the wind speed in miles per hour (must be greater than or equal to 2)");
                double windSpeed = scanner.nextDouble();
                //Compute wind chill index
                double windChillIndex = 35.74 + 0.6215 * fahrenheit - 35.75
                        * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit
                        * Math.pow(windSpeed, 0.16);
                //Display the result
                System.out.println("The wind chill index is " + windChillIndex);
                break;
        }
    }

    private static int ChangeOverYear(int current) {
        int changePerYear = (365 * 24 * 60 * 60) / 7 //Births
                + (365 * 24 * 60 * 60) / 45 //Immigrants
                - (365 * 24 * 60 * 60) / 13; //Deaths
        return current + changePerYear;
    }
}
