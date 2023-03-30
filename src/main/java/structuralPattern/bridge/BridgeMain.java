package structuralPattern.bridge;

public class BridgeMain {
    public static void main(String[] arg) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
