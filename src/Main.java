import java.util.Scanner;
// Main {
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number (1-7): ");
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
            System.out.println("The  1st day of the week is Sunday");
            break;
            case 2:
                System.out.println("The 2nd day of the week is Monday");
                break;
            case 3:
                System.out.println("The 3rd day of the week is Tuesday");
                break;
            case 4:
                System.out.println("The 4th day of the week is Wednesday");
                break;
            case 5:
                System.out.println("The 5th day of he week is Thursday");
                break;
            case 6:
                System.out.println("The 6th day of the week is Friday" );
                break;
            case 7:
                System.out.println("The 7th day of the week is Saturday");
                break;
            default:
                System.out.println("These are the days of the week");
        }
    }
}




class WorkAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user for their age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // can the person work let's see
        if (age >= 16) {
            System.out.println("You are eligible to work.");

        }else {
            System.out.println("You are not eligible to work.");
        }

        input.close();


    }

    public class FindLargestNumber {
        public static void main(String[] args) {
            int[] numbers = {10,45,27,63,95,17,31,82,74};
            //this will be a var to store the largest number
            int largest = numbers[0];

            // do an iteration through the array and try finding the largest number
            for(int i = 1; i< numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
            //print the so called largest number
            System.out.println("The largest number in the array is: " +largest);
        }
    }




}
// Else if zadacha za ceni na vacancia


public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vacation!");
        System.out.print("Enter the type of vacation (Beach or Mountain): ");
        String vacationType = scanner.next();
        System.out.print("Enter your budget per day per person: ");
        double budget = scanner.nextDouble();

        if (vacationType.equalsIgnoreCase("Beach")) {
            if (budget < 50) {
                System.out.println("This is for a beach vacation with budget under 50, Bulgaria.");
            } else {
                System.out.println("This is for a beach vacation with budget of 50 or more, outside of Bulgaria.");
            }
        } else if (vacationType.equalsIgnoreCase("Mountain")) {
            if (budget < 30) {
                System.out.println("For a Mountain vacation with budget under 30, Bulgaria");
            } else {
                System.out.println("For a Mountain vacation with budget of 30 or more, outside of Bulgaria");
            }

        } else {
            System.out.println("No information about this third type of vacation");
        }
        scanner.close();
    }
}
























