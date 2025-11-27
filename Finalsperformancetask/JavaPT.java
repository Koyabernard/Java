import java.util.Scanner;

public class JavaPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String accountUser = "Brainard";
        String AccountPass = "Balagbagako";

        int attempts = 3;

        System.out.println("==== LOGIN SYSTEM FOR STUDENT ====");

        while(attempts > 0){
            System.out.println("Login mo pangalan mo Boi");
            String username = input.nextLine();

            System.out.println("Enter mo pass mo");
            String password = input.nextLine();

            if(username.equals(accountUser) && password.equals(AccountPass)){
                System.out.println("Nakapag Login kana Boi," + username + "!");
                break;
            } else {
                attempts--;
                System.out.println("Mali ka ng login boi" + attempts);
            }

            System.out.println();
        }

        if (attempts == 0){
            System.out.println("Na lock account mo Boi");
        }
    }
}
