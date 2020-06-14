public class ShoeCloset {
    public static void main(String[] args) {

        Shoes shoes1 = new Shoes("Sneakersy", "Puma", "Czarne", 37, false);
        Shoes shoes2 = new Shoes("Sandały", "Lasocki", "Białe", 36, true);

        System.out.println(shoes1.type + " " + shoes1.brand + " " + shoes1.color + " rozmiar: " + shoes1.size + ", obcas: " + shoes1.heels);
        System.out.println(shoes2.type + " " + shoes2.brand + " " + shoes2.color + " rozmiar: " + shoes2.size + ", obcas: " + shoes2.heels);
    }
}
