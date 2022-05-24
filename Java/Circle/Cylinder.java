package Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        this(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // public double getVolume(){}

    public String toString() {
        return super.toString() + "--" + ",Cylinder[" + "height = " + this.height + "]";
    }
}
