import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login System with Brute-Force Detection ===");

        while (true) {
            System.out.print("\nUsername: ");
            String username = scanner.nextLine();

            if (!userManager.userExists(username)) {
                System.out.println("User not found.");
                continue;
            }

            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean success = userManager.login(username, password);
            AttemptLogger.log(username, success);

            if (success) {
                System.out.println("✅ Login successful!");
            } else {
                System.out.println("❌ Login failed.");
            }
        }
    }
}