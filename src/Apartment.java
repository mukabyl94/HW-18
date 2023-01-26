import java.util.Arrays;

public class Apartment extends Residents implements Payable{
    public Apartment() {
    }

    public Apartment(String[] names, String address) {
        super(names, address);
    }

    @Override
    public void pay() {
        System.out.println("Ui bulodo " + getNames().length + " kishi " + getAddress() + " kochosundogu batirde jashashat");
    }
}
