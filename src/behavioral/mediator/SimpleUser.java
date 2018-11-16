package behavioral.mediator;

public class SimpleUser extends User {
    SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User '" + getName() + "' had received: " + message);
    }
}
