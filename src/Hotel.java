public class Hotel extends Residents implements Payable{
    public Hotel() {
    }

    public Hotel(String[] names, String address) {
        super(names, address);
    }

    @Override
    public void pay() {
        System.out.println("Ui bulodo " + getNames().length + " kishi " + getAddress() + " kochosundogu gostinisada jashait");
    }
}
