package structural.facade;

public class DVDRom {
    private boolean diskLoaded = false;

    public boolean hasDiskloaded(){
        return diskLoaded;
    }

    public void loadDisk(){
        System.out.println("Disk loaded");
        diskLoaded = true;
    }

    public void unLoadDisk(){
        System.out.println("Disk unloaded");
        diskLoaded = false;
    }
}
