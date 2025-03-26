package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;
    private static int counter = 0;

    public Form() {
        this.color = "white";
        counter++;
    }

    public Form(String color) {
        this.color = color;
        counter++;
    }

    public float getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Culoarea formei este " + color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static int getCounter() {
        return counter;
    }
}
