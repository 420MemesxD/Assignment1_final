import java.util.Scanner;


public class AverageMarks {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //creates the scanner.
        System.out.printf("please input a grade ");
        int n1 = keyboard.nextInt();

        if (n1 < 0 || n1 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);

        }
        System.out.printf("please input a grade ");
        int n2 = keyboard.nextInt();

        if (n2 < 0 || n2 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }

        System.out.printf("please input a grade ");
        int n3 = keyboard.nextInt();

        if (n3 < 0 || n3 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }

        System.out.printf("please input a grade ");
        int n4 = keyboard.nextInt();

        if (n4 < 0 || n4 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }

        System.out.printf("please input a grade ");
        int n5 = keyboard.nextInt();

        if (n5 < 0 || n5 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);
        }

        System.out.printf("please input a grade ");
        int n6 = keyboard.nextInt();

        if (n6 < 0 || n6 > 100) {
            System.out.printf("That grade is invalid please restart and try again");
            System.exit(0);

            if (n6 < 50) {

            }
        }

        System.out.printf("Your grades are %n");
        //Check grade level for number 1
        if (n1 < 50) {
            System.out.printf("1. " + n1 + " =" + " E%n");
        }
        if (n1 >= 50 && n1 <= 54) {
            System.out.printf("1. " + n1 + " =" + " D%n");
        }
        if (n1 >= 55 && n1 <= 59) {
            System.out.printf("1. " + n1 + " =" + " D+%n");
        }
        if (n1 >= 60 && n1 <= 64) {
            System.out.printf("1. " + n1 + " =" + " c%n");
        }
        if (n1 >= 65 && n1 <= 69) {
            System.out.printf("1. " + n1 + " =" + " C+%n");
        }
        if (n1 >= 70 && n1 <= 74) {
            System.out.printf("1. " + n1 + " =" + " B%n");
        }
        if (n1 >= 75 && n1 <= 79) {
            System.out.printf("1. " + n1 + " =" + " B+%n");
        }
        if (n1 >= 80 && n1 <= 89) {
            System.out.printf("1. " + n1 + " =" + " A%n");
        }
        if (n1 >= 90 && n1 <= 100) {
            System.out.printf("1. " + n1 + " =" + " A+%n");
        }

        //Check grade level for number 2
        if (n2 < 50) {
            System.out.printf("2. " + n2 + " =" + " E%n");
        }
        if (n2 >= 50 && n2 <= 54) {
            System.out.printf("2. " + n2 + " =" + " D%n");
        }
        if (n2 >= 55 && n2 <= 59) {
            System.out.printf("2. " + n2 + " =" + " D+%n");
        }
        if (n2 >= 60 && n2 <= 64) {
            System.out.printf("2. " + n2 + " =" + " c%n");
        }
        if (n2 >= 65 && n2 <= 69) {
            System.out.printf("2. " + n2 + " =" + " C+%n");
        }
        if (n2 >= 70 && n2 <= 74) {
            System.out.printf("2. " + n2 + " =" + " B%n");
        }
        if (n2 >= 75 && n2 <= 79) {
            System.out.printf("2. " + n2 + " =" + " B+%n");
        }
        if (n2 >= 80 && n2 <= 89) {
            System.out.printf("2. " + n2 + " =" + " A%n");
        }
        if (n2 >= 90 && n2 <= 100) {
            System.out.printf("2. " + n2 + " =" + " A+%n");
        }

        //Check grade level for number 3

        if (n3 < 50) {
            System.out.printf("3. " + n3 + " =" + " E%n");
        }
        if (n3 >= 50 && n3 <= 54) {
            System.out.printf("3. " + n3 + " =" + " D%n");
        }
        if (n3 >= 55 && n3 <= 59) {
            System.out.printf("3. " + n3 + " =" + " D+%n");
        }
        if (n3 >= 60 && n3 <= 64) {
            System.out.printf("3. " + n3 + " =" + " c%n");
        }
        if (n3 >= 65 && n3 <= 69) {
            System.out.printf("3. " + n3 + " =" + " C+%n");
        }
        if (n3 >= 70 && n3 <= 74) {
            System.out.printf("3. " + n3 + " =" + " B%n");
        }
        if (n3 >= 75 && n3 <= 79) {
            System.out.printf("3. " + n3 + " =" + " B+%n");
        }
        if (n3 >= 80 && n3 <= 89) {
            System.out.printf("3. " + n3 + " =" + " A%n");
        }
        if (n3 >= 90 && n3 <= 300) {
            System.out.printf("3. " + n3 + " =" + " A+%n");
        }

        //Check grade level for number 4

        if (n4 < 50) {
            System.out.printf("4. " + n4 + " =" + " E%n");
        }
        if (n4 >= 50 && n4 <= 54) {
            System.out.printf("4. " + n4 + " =" + " D%n");
        }
        if (n4 >= 55 && n4 <= 59) {
            System.out.printf("4. " + n4 + " =" + " D+%n");
        }
        if (n4 >= 60 && n4 <= 64) {
            System.out.printf("4. " + n4 + " =" + " c%n");
        }
        if (n4 >= 65 && n4 <= 69) {
            System.out.printf("4. " + n4 + " =" + " C+%n");
        }
        if (n4 >= 70 && n4 <= 74) {
            System.out.printf("4. " + n4 + " =" + " B%n");
        }
        if (n4 >= 75 && n4 <= 79) {
            System.out.printf("4. " + n4 + " =" + " B+%n");
        }
        if (n4 >= 80 && n4 <= 89) {
            System.out.printf("4. " + n4 + " =" + " A%n");
        }
        if (n4 >= 90 && n4 <= 100) {
            System.out.printf("4. " + n4 + " =" + " A+%n");
        }

        //Check grade level for number 5

        if (n5 < 50) {
            System.out.printf("5. " + n5 + " =" + " E%n");
        }
        if (n5 >= 50 && n5 <= 54) {
            System.out.printf("5. " + n5 + " =" + " D%n");
        }
        if (n5 >= 55 && n5 <= 59) {
            System.out.printf("5. " + n5 + " =" + " D+%n");
        }
        if (n5 >= 60 && n5 <= 64) {
            System.out.printf("5. " + n5 + " =" + " c%n");
        }
        if (n5 >= 65 && n5 <= 69) {
            System.out.printf("5. " + n5 + " =" + " C+%n");
        }
        if (n5 >= 70 && n5 <= 74) {
            System.out.printf("5. " + n5 + " =" + " B%n");
        }
        if (n5 >= 75 && n5 <= 79) {
            System.out.printf("5. " + n5 + " =" + " B+%n");
        }
        if (n5 >= 80 && n5 <= 89) {
            System.out.printf("5. " + n5 + " =" + " A%n");
        }
        if (n5 >= 90 && n5 <= 100) {
            System.out.printf("5. " + n5 + " =" + " A+%n");
        }

        //Check grade level for number 6
        if (n6 < 50) {
            System.out.printf("6. " + n6 + " =" + " E%n");
        }
        if (n6 >= 50 && n6 <= 54) {
            System.out.printf("6. " + n6 + " =" + " D%n");
        }
        if (n6 >= 55 && n6 <= 59) {
            System.out.printf("6. " + n6 + " =" + " D+%n");
        }
        if (n6 >= 60 && n6 <= 64) {
            System.out.printf("6. " + n6 + " =" + " c%n");
        }
        if (n6 >= 65 && n6 <= 69) {
            System.out.printf("6. " + n6 + " =" + " C+%n");
        }
        if (n6 >= 70 && n6 <= 74) {
            System.out.printf("6. " + n6 + " =" + " B%n");
        }
        if (n6 >= 75 && n6 <= 79) {
            System.out.printf("6. " + n6 + " =" + " B+%n");
        }
        if (n6 >= 80 && n6 <= 89) {
            System.out.printf("6. " + n6 + " =" + " A%n");
        }
        if (n6 >= 90 && n6 <= 100) {
            System.out.printf("6. " + n6 + " =" + " A+%n");
        }


        System.out.printf("and your average grade is %.1f%%", avgrade(n1, n2, n3, n4, n5, n6));
        if (avgrade(n1, n2, n3, n4, n5, n6) < 50) {
            System.out.printf(" Thats a E%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 50 && avgrade(n1, n2, n3, n4, n5, n6) <= 54) {
            System.out.printf(" Thats a D%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 55 && avgrade(n1, n2, n3, n4, n5, n6) <= 59) {
            System.out.printf(" Thats a D+%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 60 && avgrade(n1, n2, n3, n4, n5, n6) <= 64) {
            System.out.printf(" Thats a C%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 65 && avgrade(n1, n2, n3, n4, n5, n6) <= 69) {
            System.out.printf(" Thats a C+%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 70 && avgrade(n1, n2, n3, n4, n5, n6) <= 74) {
            System.out.printf(" Thats a B%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 75 && avgrade(n1, n2, n3, n4, n5, n6) <= 79) {
            System.out.printf(" Thats a B+%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 80 && avgrade(n1, n2, n3, n4, n5, n6) <= 89) {
            System.out.printf(" Thats a A%n");
        }
        if (avgrade(n1, n2, n3, n4, n5, n6) >= 90 && avgrade(n1, n2, n3, n4, n5, n6) <= 100) {
            System.out.printf(" Thats a A+%n");
        }

    }

    public static double avgrade(int num1, int num2, int num3, int num4, int num5, int num6) {
        return (double) ((num1 + num2 + num3 + num4 + num5 + num6) / 6);


    }


}









