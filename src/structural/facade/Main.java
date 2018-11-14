package structural.facade;

public class Main {
    public static void main(String[] args) {
        /*Power power = new Power();
        power.on();

        DVDRom dvdRom = new DVDRom();
        dvdRom.loadDisk();

        SSD ssd = new SSD();
        ssd.loadFromDVD(dvdRom);*/

        Computer computer = new Computer();
        computer.copy();
    }
}
