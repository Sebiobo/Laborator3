package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;
    private float pi=3.1415f;

    public Circle() {
        super();
        this.radius = 3.0f;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override

    public float getArea() {
        return pi* radius * radius;
    }

    @Override
    public String toString() {
        return "circle [radius=" + radius + "]";
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
