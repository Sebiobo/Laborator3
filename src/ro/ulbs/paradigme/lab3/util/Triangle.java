package ro.ulbs.paradigme.lab2;

import java.util.Objects;

public class Triangle extends Form{

    private float base;
    private float height;

    public Triangle() {
        super();
        this.base = 3.0f;
        this.height = 2.0f;
    }

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", color=" + getColor() + "]";
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle Triangle = (Triangle) obj;
        return Float.compare(Triangle.base, base) == 0 &&
                Float.compare(Triangle.height, height) == 0 &&
                Objects.equals(getColor(), Triangle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, getColor());
    }
}
