public class Rectangle extends Figure{
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double areaCalculation() {
        return length*width;
    }
}
