package structural.facade;

public class SSD {
    public void loadFromDVD(DVDRom dvdRom){
        if(dvdRom.hasDiskloaded()){
            System.out.println("loading from disk in DVD-ROM");
        } else {
            System.out.println("Insert disk in DVD ROM");
        }
    }
}
