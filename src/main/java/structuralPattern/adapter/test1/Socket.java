package structuralPattern.adapter.test1;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
