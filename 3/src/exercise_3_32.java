import java.util.Scanner;

/*
(Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is
on the left of the line, on the right, or on the same line
*/
public class exercise_3_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter values
        System.out.println("Enter three points for p0, p1 and p2:");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();


        if(((px1-px0)*(py2-py0) - (px2-px0)*(py1-py0)) >0) {
            System.out.println("p2 is on the left side of the line");
        } else  if (((px1-px0)*(py2-py0) - (px2-px0)*(py1-py0)) ==0){
            System.out.println("P2 is on the same line");
        }else System.out.println("[2 is on te  right side of the line");

    }
}
