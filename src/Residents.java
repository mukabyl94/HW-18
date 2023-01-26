public class Residents {
    private String[] names;
    private String address;

    public Residents() {
    }

    public Residents(String[] names, String address) {
        this.names = names;
        this.address = address;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
