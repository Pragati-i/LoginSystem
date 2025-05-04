import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AttemptLogger {
    public static void log(String username, boolean success) {
        try (FileWriter fw = new FileWriter("login_attempts.log", true)) {
            fw.write(LocalDateTime.now() + " | " + username + " | " + (success ? "SUCCESS" : "FAIL") + "\n");
        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }
}