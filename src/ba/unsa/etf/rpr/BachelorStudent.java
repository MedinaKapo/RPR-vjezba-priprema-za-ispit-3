package ba.unsa.etf.rpr;

public class BachelorStudent extends Student {
    public BachelorStudent(String ime) {
        super(ime);
    }

    @Override
    public String toString() {
        return "Bachelor "+super.toString();
    }
}
