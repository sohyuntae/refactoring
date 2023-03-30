package structuralPattern.bridge;

public abstract class Shape {
    // Composition
    protected Color color;

    // constructor with implementor as input argument
    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
