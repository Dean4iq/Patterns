package behavioral.state.var1;

public class Main {
    public static void main(String[] args) {
        Station radioStation = new RadioFM();
        Radio radio = new Radio();
        radio.setStation(radioStation);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
