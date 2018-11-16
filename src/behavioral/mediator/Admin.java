package behavioral.mediator;

public class Admin extends User {
    Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin '" + getName()+ "' had received: " + message);
    }
}
