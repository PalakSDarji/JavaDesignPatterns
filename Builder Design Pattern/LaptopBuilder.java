public class LaptopBuilder {
    
    private String company;
    private int display;
    private int ram;
    private String storageType;

    public LaptopBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public LaptopBuilder setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setDisplay(int display) {
        this.display = display;
        return this;
    }

    public Laptop build(){
        return new Laptop(company,display,ram,storageType);
    }
}
