package structuralPattern.adapter.test2;

public class AdapterMain {
    public static void main(String[] arg) {
        Turkey turkey = new Turkey() {
            @Override
            public void gobble() {

            }

            @Override
            public void fly() {

            }
        };

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
    }
}
