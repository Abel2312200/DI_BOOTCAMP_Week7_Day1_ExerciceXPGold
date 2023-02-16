public class Shape {
    // class attributes
    private double width;
    private double height;

    // constructor without parameters

    public Shape() {
        super();
    }

    // constructor with parameters
    public Shape(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    // getters and setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // class methods
    public double area(){
        double area = 0.0;
        area = getWidth()*getHeight();
        return area;
    }
}
