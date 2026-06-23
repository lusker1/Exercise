import java.util.*; 

public class lab_4 {

     public static void main(String[] args) {
        Scanner input = new  Scanner (System.in) ; 


        // Exercise 1  Write a Java program that computes the absolute value of the product of 2 numbers given by the user. Use if/else or the ternary conditional operator (? :) to make decision.
        
// ================================================
        
        // Exercise 1          solution 1  
/*         double absproduct ; 

        System.out.println("Enter two numbers");
        double num1 = input.nextDouble(); 
        double num2 = input.nextDouble();

        double product = num1 * num2 ; 
        if(product < 0) {
            absproduct = -product ; 

        }else {
            absproduct = product ; 
        }

        System.out.println("absolute value are Equal " + absproduct); */
// ================================================

        //Exercise 1           solution 2 
/* 
        product = (product < 0) ? -product : product ; 

        System.out.println("absolute value are Equal " + product);
        
 */

// ================================================

    // Exercise 2  Write a Java program that receive a number between 1 and 7, and prints the day corresponding to 
//     the entered number starting by Friday. When the user enters a value that doesn’t correspond to any 
//     day (less than 1 or more that 7), the program displays an error message. 

    /* 
    Example 1: 
    Enter a number (1-7): 1 
    Day is Friday

    Example 2: 
    Enter a number (1-7): 7 
    Day is Thursday

    Example 3: 
    Enter a number (1-7): 9 
    Error: Invalid number! Please enter a value between 1 and 7.


    */ //solution 
// ================================================
/* 
            System.out.println("Enter a number between (1-7) : ");
        int num = input.nextInt() ; 

        switch(num) {

            case 1 : 
                System.out.println("Day is Friday");
                break ;
            case 2 : 
                System.out.println("Day is Saturday");
                break ; 
            case 3 : 
                System.out.println("Day is Sunday");
                break ; 
            case 4 : 
                System.out.println("day is monday");
                break ; 
            case 5 :
                System.out.println("day is theusday");
                break ;
            case 6 : 
                System.out.println("day is wednesday");
                break ; 
            case 7 : 
                System.out.println("day is thursday");
                break ; 
                default :
                    System.out.println("Invalid number please enter between (1-7)");   
        } */
// ================================================
/* 
// Exercise 3  Write a Java program to simulate a simple calculator. It should ask the user to enter a first number, 
the operation, and the second number. Addition ("+"), Subtraction ("-"), Division ("/"), 
Multiplication ("*"), and Modulus ("%") are the basic operations that should be implemented. Use 
the switch statement for the selection and the type char to represent the desired operation sign.  
When the operation sign is not recognized, your program should print an error message.  
Hints: (1) Declare a variable of type char for the operator, (2) Read the operation sign using 
input.next().charAt(0) where input is a variable of type Scanner, and (3) use operation signs (as 
char) in the switch’s cases (case ‘+’ :).   */

/* 

Example 1: 
Enter first number: 10 
Enter operation (+, -, *, /, %): + 
Enter second number: 20 
Result: 30

Example 2: 
Enter first number: 10 
Enter operation (+, -, *, /, %): ^ 
Enter second number: 2 
Error: Unknown operation! 



*/
/* // solution 
// ================================================

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble() ; 

        System.out.println("Enter operation (+ , - , * , / , %): ");
        char operation = input.next().charAt(0) ; 

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble() ; 


        switch(operation) {
            case '+' : 
                double formula1 = (num1 + num2) ; 
                System.out.println("Result : " + formula1);
            break ; 

            case '-' :
                double formula2 = (num1 - num2) ; 
                System.out.println("Result : " + formula2);
            break ; 

            case '*' :
                double formula3 = (num1 * num2) ; 
                System.out.println("Result : " + formula3);

            break ; 

            case '/' : 
                double formula4 = (num1 / num2) ; 
                System.out.println("Result : " + formula4);

            break ; 

            case '%' : 
                double formula5 = (num1 % num2);
                System.out.println("Result : " + formula5);
            default : 
                System.out.println("Error Unknown operation!");   
        }
// ================================================

 */     

/* 

Exercise 4 
Write a Java program that simulates primitive bank operations. The program will perform the 
following tasks:  
• Declare the amount variable and initialize it with the value 5000.  
• Print a menu of possible operations: 1) Amount, 2) Deposit, and 3) Withdraw.  
• Ask the depositor to choose an operation:  
o If the operation is 1, print the amount 
o If the operation is 2, ask the user to enter the amount to deposit and add it to the old amount and print the result.  
o If the operation is 3, ask the user to enter the amount to withdraw and add 
subtract it from the old amount (only if it is possible) and print the result.  

Example 1:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 1  
The amount is 5000.000000.  

Example 2:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 2  
Enter the amount to deposit: 300  
The new amount is 5300.000000.  

Example 3:  
Choose an operation:  
1) Amount  
2) Deposit  
3) Withdraw  
Please choose 1, 2 or 3: 3  
Enter the amount to withdraw: 3202  
The new amount is 1798.000000.

*/
/* 
         int num  ; 
        System.out.printf("Choose an operation \n1) Amount \n2) Deposit \n3) Withdraw \nPlease choose 1, 2 or 3:");
        num = input.nextInt() ; 

        double amount = 5000.000000 ; 
        switch(num) {

            case 1 :
                System.out.println("The amount is : " + amount );
                break ; 
            case 2 : 
                System.out.println("Enter the amount to deposit: ");
                double deposit = input.nextDouble() ; 
                double formula1 = (amount + deposit) ; 

                System.out.println("The new Amount is :" +formula1);
                break ; 
            case 3 : 
                System.out.println("Enter the amount withdraw: " );
                double withdraw = input.nextDouble() ; 

                double formula2 = (amount - withdraw) ; 

                System.out.println("the new amount is : " + formula2);
                break ; 

            default : 
                System.out.println("Invalid please choose 1, 2 or 3 ");
        }
          */

// ================================================
 

/* 

Exercise 5 
Write a Java program that allows a driver to determine the cost of an automobile insurance. 
Your program has to: 
• Ask the driver to input his/her age and the number of accidents that the driver has had. 
• Compute and print the total cost based on: 
o Basic charge is $500 
o Surcharge of $100 if the driver under 25 
o Additional surcharge for the number of accidents:

Accident Surcharge ($) 
1 
50 
2 
125 
3 
225 
4 
375 
5 
575
6 or more
No insurance

Example 1: 
How old are you? 45 
How many accidents you had before? 6 
Sorry, No insurance 

Example 2: 
How old are you? 20 
How many accidents you had before? 3 
Your insurance cost is 825

Example 3: 
How old are you? 30 
How many accidents you had before? 3 
Your insurance cost is 725


*/
/* 
        System.out.println("How old are you ? : ");
        int old = input.nextInt();

        System.out.println("How many accidents you had before? ");
        int accidents = input.nextInt();

        double Surcharge = 100;
        switch (accidents) {

            case 0:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 500 : "your insurance cost is " + (Surcharge + 500));
                break ;
            case 1:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 550 : "Your insurance cost is " + (Surcharge + 550));
                break;
            case 2:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 625 : "Your insurance cost is " + (Surcharge + 625));
                break;
            case 3:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 725 : "Your insurance cost is " + (Surcharge + 725));
                break;
            case 4:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 875 : "Your insurance cost is " + (Surcharge + 875));
                break;
            case 5:
                System.out.println(
                        (old >= 25) ? "Your insurance cost is " + 1075 : "Your insurance cost is " + (Surcharge + 1075));
                break;

            default:
                System.out.println("Sorry No insurance");
                }

 */


                
        input.close();
     }
}