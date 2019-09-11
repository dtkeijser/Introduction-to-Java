public class Circle {
    //radius of this circle
    double radius =1;

    //construct a circle object
    Circle(){

    }

    //Construct a Circle object
     Circle(double newRadius) {
        radius=newRadius;
    }

    //Return the area of this circle
    double getArea(){
        return radius *radius *Math.PI;
    }

    double getPerimeter(){
        return 2 * radius *Math.PI;
    }

    // Set a new radius for this circle
    void setRadius(double newRadius){
        radius=newRadius;
    }

}
