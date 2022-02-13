public class FountainPenAdapater implements Pen{

    private FountainPen fountainPen = new FountainPen();

    @Override
    public void write(String text) {
        fountainPen.drawText(text);
    }
    
}
