package structural.adapter;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface {
    @Override
    public void drawLine() {
        dravRasterline();
    }

    @Override
    public void drawFigure() {
        drawRasterFigure();
    }
}
