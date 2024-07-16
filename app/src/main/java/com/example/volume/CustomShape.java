package com.example.volume;
public class CustomShape {
    int shapeimg;
    String shapename;

    public CustomShape(int shapeimg, String shapename) {
        this.shapeimg = shapeimg;
        this.shapename = shapename;
    }

    public int getShapeimg() {
        return shapeimg;
    }

    public void setShapeimg(int shapeimg) {
        this.shapeimg = shapeimg;
    }

    public String getShapename() {
        return shapename;
    }

    public void setShapename(String shapename) {
        this.shapename = shapename;
    }
}
