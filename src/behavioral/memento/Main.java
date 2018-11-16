package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("Wolfenstein_12", 340);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());
        System.out.println("Saved");

        game.set("Wolfenstein_14", 580);
        System.out.println(game);

        System.out.println("GAME OVER");
        System.out.println("Loading last save...");

        game.load(file.getSave());
        System.out.println(game);
    }
}
