package week_5;

public class Triangle {

    int side1;
    int side2;
    int side3;

    boolean isScalene() {
        if (side1 != side2 && side1 != side3 && side2 != side3) {
            return true;
        }else {
            return false;
        }
    }

    //
    boolean isIsosceles() {
        if (side1 == side2 || side1 == side3 || side2 == side3 ) {
            return true;
        }else {
            return false;
        }
    }

    //Equilateral is a specific kind of isosceles triangle.
    boolean isEquilateral() {
        if (side1 == side2 && side1 == side3) {
            return true;
        }else {
            return false;
        }
    }

    int calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
