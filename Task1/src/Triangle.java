public class Triangle extends Figure {
    double side, heigth;

    public Triangle(double side, double heigth) {
        this.side = side;
        this.heigth = heigth;
    }

    double areaCalculation() {
        return (side*heigth)/2;
    }
}
