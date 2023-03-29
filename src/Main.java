public class Main {
    public static void main(String[] args) {
        Laptop mac = new Laptop(new MacbookBuilder());
        System.out.println(mac.toString());
    }
}