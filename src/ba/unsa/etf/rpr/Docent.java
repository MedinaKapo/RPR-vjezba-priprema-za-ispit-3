package ba.unsa.etf.rpr;

public class Docent extends Nastavnik implements Mladi{
    public Docent(String ime) {
        super(ime);
    }

    @Override
    public String toString() {
        return "Doc."+super.toString();
    }
}
