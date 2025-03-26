import ro.ulbs.paradigme.lab2.*;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;
import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.api.*;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Form defaultForm = new Form();
        Form redForm = new Form("red");
        Form blueForm = new Form("blue");

        System.out.println(defaultForm.toString());
        System.out.println(redForm.toString());
        System.out.println(blueForm.toString());


        System.out.println("Număr total de instanțe create: " + Form.getCounter());

        
    }
}