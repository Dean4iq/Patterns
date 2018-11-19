package structural.proxy;

public class RealImage implements Image {
    private String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Загрузка файла " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр файла " + file);
    }
}
