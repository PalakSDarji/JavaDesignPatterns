public class PilotPenAdapter implements Pen {

    private PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String text) {
        pilotPen.markText(text);
    }
    
}
