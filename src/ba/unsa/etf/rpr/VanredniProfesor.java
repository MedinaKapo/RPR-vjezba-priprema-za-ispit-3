package ba.unsa.etf.rpr;

public class VanredniProfesor extends Nastavnik {
    public VanredniProfesor(String ime) {
        super(ime);
    }

    @Override
    public String toString() {
        return "V. prof."+super.toString();
    }
}
