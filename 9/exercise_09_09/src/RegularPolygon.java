public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    //create a non arg constructor
    RegularPolygon(){
        n=3;
        side = 1;
        x = 0;
        y = 0;
    }
    //

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
        x = y = 0;
    }

    //setters and getters

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    // method to get perimeter
    public double getPerimeter() {
        return side * n;
    }
    //method to get area
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
