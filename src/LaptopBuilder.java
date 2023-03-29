public class LaptopBuilder {
    private String brand, cpu, gpu;
    private int year, ram, rom;

    public Laptop getResult() {
        return new Laptop(this);
    }

    public void setBrand(String brand)  {
        this.brand = brand;
    }
    public String getBrand()  {
         return brand;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getCpu()  {
        return cpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public String getGpu()  {
        return gpu;
    }
    public void setProdYear(int year) {
        this.year = year;
    }
    public int getProdYear()  {
        return year;
    }
    public void setRAM(int ram) {
        this.ram = ram;
    }
    public int getRAM()  {
        return ram;
    }
    public void setROM(int rom) {
        this.rom = rom;
    }
    public int getROM()  {
        return rom;
    }
}
