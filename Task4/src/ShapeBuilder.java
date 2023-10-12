import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double total = 0;
        for(Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
