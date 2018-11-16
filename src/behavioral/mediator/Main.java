package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Admin2008");
        User u1 = new SimpleUser(chat, "Ivan68");
        User u2 = new SimpleUser(chat, "RedHeЯT");
        User u3 = new SimpleUser(chat, "Liu Kang");

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u2.setEnable(false);

        u1.sendMessage("Hello everybody");
        admin.sendMessage("BANNED forever! Reason: You have no power here");
    }
}
