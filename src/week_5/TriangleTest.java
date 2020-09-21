package week_5;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;

        System.out.println(triangle.isScalene());
        System.out.println(triangle.isIsosceles());
        System.out.println(triangle.isEquilateral());
        System.out.println("Triangle perimeter:" + triangle.calculatePerimeter());
    }
}
