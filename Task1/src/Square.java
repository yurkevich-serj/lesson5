public class Square extends Figure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    double areaCalculation() {
        return side*side;
    }
}
