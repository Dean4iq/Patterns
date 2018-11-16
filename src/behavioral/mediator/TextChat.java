package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("NOPE!");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("Unacceptable!");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("You are dedicated to another chat!");
        }
    }

    @Override
    public void sendMessage(String message, User sender) {
        if (sender instanceof Admin) {
            users.forEach(user -> user.getMessage(sender.getName() + ": " + message));
        } else {
            users.stream()
                    .filter(user->user!=sender && user.isEnable())
                    .forEach(user -> user.getMessage(sender.getName() + ": " + message));
            if (admin.isEnable()){
                admin.getMessage(sender.getName() + ": " + message);
            }
        }

    }
}
