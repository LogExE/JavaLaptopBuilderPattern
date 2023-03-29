public class Laptop {

    private String brand, cpu, gpu;
    private int producedYear, ram, rom;

    public Laptop(LaptopBuilder builder) {
        brand = builder.getBrand();
        cpu = builder.getCpu();
        gpu = builder.getGpu();

        producedYear = builder.getProdYear();
        ram = builder.getRAM();
        rom = builder.getROM();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop ");
        sb.append(this.hashCode());
        sb.append("\nBrand: ");
        sb.append(brand);
        sb.append("\nCPU: ");
        sb.append(cpu);
        sb.append("\nGPU: ");
        sb.append(gpu);
        sb.append("\nProduced in: ");
        sb.append(producedYear);
        sb.append("\nMemory: ");
        sb.append(ram);
        sb.append("GB RAM and ");
        sb.append(rom);
        sb.append("GB ROM");
        return sb.toString();
    }
}
