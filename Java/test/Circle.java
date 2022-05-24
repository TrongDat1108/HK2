package test;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double width) {
        this.radius = width;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }

    public String toString() {
        return super.toString() + ",radius = " + this.radius + " ]";
    }
}
