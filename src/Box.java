import java.util.ArrayList;

public class Box implements Shape{
    ArrayList<Shape> shapes = new ArrayList<>();
    private double available;
    private double volume;

    public Box (double volume) {
        this.volume = volume;
        available = volume;
    }

    public boolean add (Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        }
        return false;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}