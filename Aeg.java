import java.util.Scanner;
public class Aeg {
    public static void main(String[] args) {
        final int AGE = 20;
        int inpotAge ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you age : ");
        inpotAge = scan.nextInt();
        System.out.println("you entered : ");
        if(inpotAge < 20)
            System.err.println("your are still young");
        System.err.println("Good Bye");
    }
}
