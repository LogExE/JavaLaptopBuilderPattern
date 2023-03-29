public class LaptopBuilder {
    private String brand, cpu, gpu;
    private int year, ram, rom;

    public Laptop getResult() {
        return new Laptop(this);
    }

    public LaptopBuilder setBrand(String brand)  {
        this.brand = brand;
        return this;
    }
    public String getBrand()  {
         return brand;
    }
    public LaptopBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu()  {
        return cpu;
    }
    public LaptopBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    public String getGpu()  {
        return gpu;
    }
    public LaptopBuilder setProdYear(int year) {
        this.year = year;
        return this;
    }
    public int getProdYear()  {
        return year;
    }
    public LaptopBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }
    public int getRAM()  {
        return ram;
    }
    public LaptopBuilder setROM(int rom) {
        this.rom = rom;
        return this;
    }
    public int getROM()  {
        return rom;
    }
}
