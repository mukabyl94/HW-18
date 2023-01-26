public class Hostel extends Residents implements Payable {
    public Hostel() {
    }

    public Hostel(String[] names, String address) {
        super(names, address);
    }

    @Override
    public void pay() {
        System.out.println("Ui bulodo " + getNames().length + " kishi " + getAddress() + " kochosundogu obshejitiede jashait");
    }
}
