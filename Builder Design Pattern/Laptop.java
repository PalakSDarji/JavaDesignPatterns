public class Laptop {
    private String company;
    private int display;
    private int ram;
    private String storageType;

    public Laptop(String company, int display, int ram, String storageType) {
        this.company = company;
        this.display = display;
        this.ram = ram;
        this.storageType = storageType;
    }

    @Override
    public String toString() {
        return "Laptop [company=" + company + ", display=" + display + ", ram=" + ram + ", storageType=" + storageType
                + "]";
    }

    
}
