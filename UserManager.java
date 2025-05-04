import java.util.HashMap;

public class UserManager {
    private HashMap<String, User> users = new HashMap<>();

    public UserManager() {
        users.put("alice", new User("alice", "1234"));
        users.put("bob", new User("bob", "pass"));
    }

    public boolean login(String username, String password) {
        User user = users.get(username);
        if (user == null) return false;

        if (user.isLocked()) {
            System.out.println("Account locked due to suspicious activity.");
            return false;
        }

        if (user.password.equals(password)) {
            user.failedAttempts = 0;
            return true;
        } else {
            user.failedAttempts++;
            if (user.failedAttempts >= 3) {
                user.lock();
                System.out.println("Account locked after 3 failed attempts.");
            }
            return false;
        }
    }

    public boolean userExists(String username) {
        return users.containsKey(username);
    }
}