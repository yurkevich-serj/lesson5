public class Circle extends Figure {

    private double radious, pi = 3.14;

    public Circle(double radious) {
        this.radious = radious;
    }

    double areaCalculation() {
        return pi*radious*radious;
    }
}
