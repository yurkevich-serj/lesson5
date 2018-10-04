public class Main {

    public static void main (String[] args) {

        Circle square = new Circle(9.00);
        Rectangle square1 = new Rectangle(2.00,4.00);
        Triangle square2 = new Triangle(6.00, 3.00);
        Square square3 = new Square(4.00);
        System.out.println(" Square of circle is "+square.areaCalculation());
        System.out.println(" Square of rectangle is "+square1.areaCalculation());
        System.out.println(" Square of triangle is "+square2.areaCalculation());
        System.out.println(" Square of square is "+square3.areaCalculation());
    }
}
