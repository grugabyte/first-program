import java.util.Scanner;
public class password {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter password");
                String response = scanner.next();

                if(response.equals("nikocado")) {
                        System.out.println("correct password");
                }
                else {
                        System.out.println("\""+response+"\" was incorrect. \nTry again.");
                }
        }
}
