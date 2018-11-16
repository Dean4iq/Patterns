package behavioral.mediator;

abstract class User {
    private Chat chat;
    private String name;
    private boolean isEnable = true;

    User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void getMessage(String message);

    void sendMessage(String message){
        chat.sendMessage(message, this);
    }

    String getName() {
        return name;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    @Override
    public String toString() {
        return "User{" +
                "chat=" + chat +
                ", name='" + name + '\'' +
                ", isEnable=" + isEnable +
                '}';
    }
}
