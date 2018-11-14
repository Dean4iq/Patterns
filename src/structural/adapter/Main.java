package structural.adapter;

public class Main {
    public static void main(String[] args) {
        //наследование
        VectorGraphicsInterface vgi = new VectorAdapterFromRaster();
        vgi.drawLine();
        vgi.drawFigure();

        //композиция
        VectorGraphicsInterface vgi2 = new VectorAdapterFromRaster2(new RasterGraphics());
        vgi2.drawLine();
        vgi2.drawFigure();
    }
}
