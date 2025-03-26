import ro.ulbs.paradigme.lab3.util.PasswordMaker;


public class Main {
    public static void main(String[] args) {
        PasswordMaker pm1 = PasswordMaker.getInstance();
        System.out.println("Generated password: " + pm1.getPassword());

        PasswordMaker pm2 = PasswordMaker.getInstance();
        System.out.println("Generated password: " + pm2.getPassword());

        System.out.println("Număr de accesări ale getInstance(): " + PasswordMaker.getInstanceCount());
    }
}