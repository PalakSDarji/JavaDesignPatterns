public class BuilderDemo {
    public static void main(String[] args) {
        
        Laptop laptop = new LaptopBuilder()
            .setCompany("HP")
            .setRam(8)
            .build();

        System.out.println("Laptop : "+ laptop);
    }
}
