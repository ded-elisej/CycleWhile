import java.util.Scanner;

public class EndlessCycleWithExit {
    //In this task i'm creating endless cycle "while.." end exit it after message "Exit"
    public static void main(String[] args) {
        System.out.print("Input same string: ");
        String sameString = new Scanner(System.in).nextLine();
        while (true){
            if (sameString.equalsIgnoreCase("Exit")) {
                System.out.println(sameString);
                break;
            } else System.out.println("You're input not Exit");

        }
        System.out.println("Congratulations! You're input right word");
    }

}
