public class Fan {
    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;
    private int speed;

    private boolean on;
    private double radius;
    private String color;

    //Constructor that creates a default fan
    Fan(){
        speed = SLOW;
        on=false;
        color = "blue";
        radius = 5;
    }
    //Mutator methods


    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW: s = "SLOW"; break;

            case MEDIUM: s = "MEDIUM"; break;

            case FAST: s = "FAST";

        }

        return s;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "speed " + speed + "\n"
                + "color " + color + "\n"
                + "radius " + radius + "\n"
                + ((on) ? "fan is on" : "fan is off");
    }
}
