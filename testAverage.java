   import java.util.Scanner;
    public class testAverage {
        public static void main(String[] args) {
            int num1, num2, num3;
            double average;
            char repeat;
            String input;
            Scanner in = new Scanner(System.in);
            System.err.println("This program calculates the average of thre");
            do{
                System.err.print("Rnter your number #1 : ");
                num1 = in.nextInt();
                System.err.print("Rnter your number #2 : ");
                num2 = in.nextInt();
                System.err.print("Rnter your number #3 : ");
                num3 = in.nextInt();
                average = (num1 + num2 + num3) / 3.0 ;
                System.err.println("the averge is "+average);
                System.err.println();
                System.err.println("Would you like to test : ");
                System.err.print("Enter Y for yes or N for no : ");
                in.nextLine();
                input = in.nextLine();
                repeat = input.charAt(0);
            }while( repeat == 'Y' || repeat == 'y');
        }
        
    }

