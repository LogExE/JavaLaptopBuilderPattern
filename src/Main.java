public class Main {
    public static void main(String[] args) {
        Laptop mac = new Laptop(new MacbookBuilder());
        System.out.println(mac.toString());
        System.out.println();
        LaptopBuilder lb = new LaptopBuilder();
        lb.setBrand("Redmi")
                .setCpu("i7 11320h")
                .setGpu("Iris")
                .setProdYear(2021)
                .setRAM(16)
                .setROM(512);
        System.out.println(new Laptop(lb).toString());
    }
}