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

        } else {
            System.out.println("You are not eligible to work.");
        }

        input.close();
    }



        public static void vacation() {
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






// Else if zadacha za ceni na vacancia



    public static void thirdCalc() {
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


// some  very basic method exercises
// let's start when the method is void and does not require return of any type

//public class Main {
    static void myFabName(String fname) { // myFabName is properly defined and enclosed within()

        System.out.println(fname + "Apostolova"); //The System.out.println statement is inside the myFabName function, so it can access the fname parameter
    }

}

//let's write a method that requires a return
class ReturnSomeNumber { // I am defining a class
    static int myMethod(int x) { // with static method myMethod that takes an integer x as a parameter
        return 5 + x; //and returns the result of adding 5 to x
    }

    public static void main(String[] args) { //This is the Main method
        System.out.println(myMethod(3)); // the Main method then calls myMethod with the argument 3 and prints the result
    }
}
// This should show 8 in the console

//another one wit return

//this is for checking allowed age with if and else and methods

class CheckAgePermit{ // I defined a class
    static void checkAge(int age) { // I just CREATED a method with int variable called age
        // let;s check if age is less than 18, print "Access Denied"
        if (age < 18 ){
            System.out.println("Access denied");
            //If age is greater than 18, or equal to 18, print "Access granted"

        } else  { // else does not need assigned parameters such as >=
            System.out.println("Access granted");
        }
    }
    public static void main(String [] args) {
        // I am calling the checkAge  method and pass along an age of 20
        checkAge(20);
    }

}
// I will see a message Access granted

// some classes exercise

class MyClass {
    int x = 5;
    public static void main(String [] args) {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }
}

// method overload exercises Instead of defining two methods that should do the same thing, it is better to overload one.
//
//In the example below, we overload the plusMethod method to work for both int and double:

class OverloadMethod { //create a class
    static int plusMethod(int x, int y) { // open a method plusMethod and w/parameters
        return x + y; // return sum of int x and int y

    }

    static double plusMethod(double x, double y) { // create a method w/the same name and different parameters
        return x + y; // return sum of double x and double y
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5); //assign var values for int
        double myNum2 = plusMethod(4.3, 6.26); // assign var values for double
        System.out.println("int: " + myNum1); // print message for int sum
        System.out.println("double: " + myNum2);
    }
}

// print message for double sum

// very major important Multiple methods can have the same name as long as the number and/or type of parameters are different.

// print result/output for int x and y = 13 for double values of x and y = 10.559999999

// Method Parameters messing around exercise


// Trying to make isEven method happen

class EvenChecker {
    public static boolean isEven(int number) {
        // Check if the number is even by checking if it's divisible by 2 with no remainder
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 6; // Example input
        boolean result = isEven(num);

        if (result) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }
    }
}

// Palindrome Checker task

class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // A negative number cannot be a palindrome
        }

        // Convert the integer to a string
        String numStr = Integer.toString(number);

        // Compare characters from the beginning and end of the string
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false; // If any characters do not match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }

    public static void main(String[] args) {
        int num = 12321; // Example input
        boolean result = isPalindrome(num);

        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}























