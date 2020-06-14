public class ShoeCloset {
    public static void main(String[] args) {
        Shoes shoes1 = new Shoes();
        shoes1.type = "Sneakersy";
        shoes1.brand = "Puma";
        shoes1.color = "Czarne";
        shoes1.size = 37;
        shoes1.heels = false;

        Shoes shoes2 = new Shoes();
        shoes2.type = "Sandały";
        shoes2.brand = "Lasocki";
        shoes2.color = "Białe";
        shoes2.size = 36;
        shoes2.heels = true;

        System.out.println(shoes1.type + " " + shoes1.brand + " " + shoes1.color + " rozmiar: " + shoes1.size + ", obcas: " + shoes1.heels);
        System.out.println(shoes2.type + " " + shoes2.brand + " " + shoes2.color + " rozmiar: " + shoes2.size + ", obcas: " + shoes2.heels);
    }
}
