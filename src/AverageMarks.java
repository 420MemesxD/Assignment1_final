import java.util.Scanner;


public class AverageMarks {

 /*
    The main method first prints to the screen "please input a grade". It then waits for user input to input a grade.
    The main method then checks the number to see if it is in-between 0 and 100. If it is grater than 100 or less than 0
    the system will print out "That grade is invalid please restart and try again" and exit the program. The main Method
    will then ask again for a grade, wait for input and check the input to see if it is grater than 100 or less than 0.
    This process of asking for input waiting for input and checking input repeats six times. The main method then gets the
    letter grades for all of the values entered by the user. This is done by checking each grade number and based off what
    number it is assign it an overall letter grade. For example if the entered grade was 78% then because it is
    between 75 and 79 it is assigned the rating of +B. This process is repeated for all 6 grades entered.The main method
    then prints out all 6 of your grades to the screen with the their corresponding letter grades. The main method then
    calculates the overall grade average and prints it to the screen. The main method then calculates the letter grade
    for your average and prints it to the screen next to your grade. The main method is now finished and exits.

    grade1-grade6 = group of 6 grades
    print enter a grade
    input the grade
    if the grade is not valid exit system
    else
    store the grade inside of grade1-grade6
    print the corresponding letter grade and number to the grade that was entered
    print the average grade and corresponding letter grade to the average grade

*/

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //creates the scanner.

        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade1 = keyboard.nextInt();

        //check grade6 to see if its in between 0 and 100
        if (grade1 < 0 || grade1 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);

        }
        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade2 = keyboard.nextInt();

        //check grade6 to see if its in between 0 and 100
        if (grade2 < 0 || grade2 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }
        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade3 = keyboard.nextInt();

        //check grade3 to see if its in between 0 and 100
        if (grade3 < 0 || grade3 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }

        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade4 = keyboard.nextInt();

        //check grade4 to see if its in between 0 and 100
        if (grade4 < 0 || grade4 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }
        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade5 = keyboard.nextInt();

        //check grade5 to see if its in between 0 and 100
        if (grade5 < 0 || grade5 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }
        //ask user for a grade
        System.out.printf("please input a grade ");
        int grade6 = keyboard.nextInt();
        //check grade6 to see if its in between 0 and 100
        if (grade6 < 0 || grade6 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);

        }

        System.out.printf("Your grades are %n");
        //Check grade level for number 1
        if (grade1 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade1);
        }
        if (grade1 >= 50 && grade1 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade1);
        }
        if (grade1 >= 55 && grade1 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade1);
        }
        if (grade1 >= 60 && grade1 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade1);
        }
        if (grade1 >= 65 && grade1 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade1);
        }
        if (grade1 >= 70 && grade1 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade1);
        }
        if (grade1 >= 75 && grade1 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade1);
        }
        if (grade1 >= 80 && grade1 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade1);
        }
        if (grade1 >= 90 && grade1 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade1);
        }

        //Check grade level for number 2
        if (grade2 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade2);
        }
        if (grade2 >= 50 && grade2 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade2);
        }
        if (grade2 >= 55 && grade2 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade2);
        }
        if (grade2 >= 60 && grade2 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade2);
        }
        if (grade2 >= 65 && grade2 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade2);
        }
        if (grade2 >= 70 && grade2 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade2);
        }
        if (grade2 >= 75 && grade2 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade2);
        }
        if (grade2 >= 80 && grade2 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade2);
        }
        if (grade2 >= 90 && grade2 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade2);
        }

        //Check grade level for number 3

        if (grade3 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade3);
        }
        if (grade3 >= 50 && grade3 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade3);
        }
        if (grade3 >= 55 && grade3 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade3);
        }
        if (grade3 >= 60 && grade3 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade3);
        }
        if (grade3 >= 65 && grade3 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade3);
        }
        if (grade3 >= 70 && grade3 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade3);
        }
        if (grade3 >= 75 && grade3 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade3);
        }
        if (grade3 >= 80 && grade3 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade3);
        }
        if (grade3 >= 90 && grade3 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade3);
        }

        //Check grade level for number 4
        
        if (grade4 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade4);
        }
        if (grade4 >= 50 && grade4 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade4);
        }
        if (grade4 >= 55 && grade4 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade4);
        }
        if (grade4 >= 60 && grade4 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade4);
        }
        if (grade4 >= 65 && grade4 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade4);
        }
        if (grade4 >= 70 && grade4 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade4);
        }
        if (grade4 >= 75 && grade4 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade4);
        }
        if (grade4 >= 80 && grade4 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade4);
        }
        if (grade4 >= 90 && grade4 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade4);
        }

        //Check grade level for number 5
        
        if (grade5 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade5);
        }
        if (grade5 >= 50 && grade5 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade5);
        }
        if (grade5 >= 55 && grade5 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade5);
        }
        if (grade5 >= 60 && grade5 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade5);
        }
        if (grade5 >= 65 && grade5 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade5);
        }
        if (grade5 >= 70 && grade5 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade5);
        }
        if (grade5 >= 75 && grade5 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade5);
        }
        if (grade5 >= 80 && grade5 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade5);
        }
        if (grade5 >= 90 && grade5 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade5);
        }

        //Check grade level for number 6
        if (grade6 < 50) {
            System.out.printf("6. %d%% = E%n" ,grade6);
        }
        if (grade6 >= 50 && grade6 <= 54) {
            System.out.printf("6. %d%% = D%n" ,grade6);
        }
        if (grade6 >= 55 && grade6 <= 59) {
            System.out.printf("6. %d%% = D+%n" ,grade6);
        }
        if (grade6 >= 60 && grade6 <= 64) {
            System.out.printf("6. %d%% = C%n" ,grade6);
        }
        if (grade6 >= 65 && grade6 <= 69) {
            System.out.printf("6. %d%% = C+%n" ,grade6);
        }
        if (grade6 >= 70 && grade6 <= 74) {
            System.out.printf("6. %d%% = B%n" ,grade6);
        }
        if (grade6 >= 75 && grade6 <= 79) {
            System.out.printf("6. %d%% = B+%n" ,grade6);
        }
        if (grade6 >= 80 && grade6 <= 89) {
            System.out.printf("6. %d%% = A%n" ,grade6);
        }
        if (grade6 >= 90 && grade6 <= 100) {
            System.out.printf("6. %d%% = A+%n" ,grade6);
        }

        //print out the average grade and its corresponding letter grade
        System.out.printf("and your average grade is %.1f%%", avgrade(grade1, grade2, grade3, grade4, grade5, grade6));
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) < 50) {
            System.out.printf(" Thats a E%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 50 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 54) {
            System.out.printf(" Thats a D%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 55 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 59) {
            System.out.printf(" Thats a D+%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 60 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 64) {
            System.out.printf(" Thats a C%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 65 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 69) {
            System.out.printf(" Thats a C+%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 70 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 74) {
            System.out.printf(" Thats a B%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 75 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 79) {
            System.out.printf(" Thats a B+%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 80 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 89) {
            System.out.printf(" Thats a A%n");
        }
        if (avgrade(grade1, grade2, grade3, grade4, grade5, grade6) >= 90 && avgrade(grade1, grade2, grade3, grade4, grade5, grade6) <= 100) {
            System.out.printf(" Thats a A+%n");
        }

    }


    /**
     * This method collects all the user entered grades and calculates an overall average grade.
    */

    public static double avgrade(int num1, int num2, int num3, int num4, int num5, int num6) {
        return (double) ((num1 + num2 + num3 + num4 + num5 + num6) / 6);


    }



}









