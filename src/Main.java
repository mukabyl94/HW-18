public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(new String[]{"Jumabek", "Aidai", "Nurbek", "Guli"}, "Chui 245");
        apartment.pay();
        Hostel hostel = new Hostel(new String[]{"Asan", "Muradil", "Ermek"}, "Frunze 26");
        hostel.pay();
        Hotel hotel = new Hotel(new String[]{"Joni", "Daniyar", "Kairat"}, "Jibek jolu 235");
        hotel.pay();
    }
}