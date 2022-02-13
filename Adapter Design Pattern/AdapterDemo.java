public class AdapterDemo{
    public static void main(String[] args) {

        WorkSheet workSheet = new WorkSheet();
        PilotPenAdapter penAdapter = new PilotPenAdapter();
        workSheet.writetheText(penAdapter);

        FountainPenAdapater fountainPenAdapater = new FountainPenAdapater();
        workSheet.writetheText(fountainPenAdapater);
    }
}