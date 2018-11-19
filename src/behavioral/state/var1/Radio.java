package behavioral.state.var1;

public class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioFM());
        } else if (station instanceof RadioFM) {
            setStation(new HitFM());
        } else if (station instanceof HitFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
