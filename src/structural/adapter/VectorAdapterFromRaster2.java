package structural.adapter;

public class VectorAdapterFromRaster2 implements VectorGraphicsInterface {
    private RasterGraphics rasterGraphics;

    VectorAdapterFromRaster2(RasterGraphics rasterGraphics){
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.dravRasterline();
    }

    @Override
    public void drawFigure() {
        rasterGraphics.drawRasterFigure();
    }
}
