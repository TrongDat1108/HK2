package shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

}
