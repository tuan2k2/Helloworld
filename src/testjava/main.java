package testjava;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of rectangle = ");
        int x = scanner.nextInt();
        System.out.println("enter width of rectangle =");
        int y = scanner.nextInt();
        int circumferennce = perimeter(x, y);
        int area = area(x,y);
        System.out.println("circumferennce = " + circumferennce);
        System.out.println("area= " + area);
        //2
        System.out.println("enter length of rectangle box = ");
        float length = scanner.nextFloat();
        System.out.println("enter width of rectangle box=");
        float width = scanner.nextFloat();
        System.out.println("enter height of rectangle box =");
        float height = scanner.nextFloat();
        float surroundingerea = surroundingerea( length , width , height );
        float volume = volume(length , width , height );
        System.out.println("surroundingerea= " + surroundingerea);
        System.out.println("volume= " + volume);
        //3
        System.out.println("enter the coefficients:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double denta = b*b - (4*a*c);
        if (a==0){
            if ( b==0) {
                System.out.println("the equation has no solution");
            } else {
                double singleTest = singleTest(b,c);
                System.out.println("equation has a solution = " + singleTest);
            }
        } else {
            if (denta < 0) {
                System.out.println("the equation has no solution");
            }
            if (denta == 0){
                System.out.println(" the equation has a double solution" + -b/(2*a));
            }
            if (denta > 0){
                double testOne = testOne(a,b,c);
                double testTwo = testTwo(a,b,c);
                System.out.println("x1= " + testOne);
                System.out.println("x2= " + testTwo);
            }
        }
    }
    // lesson 1
    public static int perimeter(int length, int width) {
        return (length + width) / 2;
    }

    public static int area(int length, int width) {
        return (length * width);
    }
    //lesson 2
    public static float surroundingerea(float length , float width , float height){
        return (2*height*(length+width));
    }
    public static float volume( float length , float width , float height){
        return (height*length*width);
    }
    // lesson 3
    public  static double singleTest(double b , double c){
        return (-c/b);
    }
    public  static double testOne(double a, double b , double c){
        return ((-b+Math.sqrt((b*b)-4*a*c))/2*a);
    }
    public static double testTwo(double a , double b , double c){
        return ((-b-Math.sqrt((b*b)-4*a*c))/2*a);
    }
}
