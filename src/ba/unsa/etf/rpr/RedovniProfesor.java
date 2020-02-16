package ba.unsa.etf.rpr;

public class RedovniProfesor extends Nastavnik {
    public RedovniProfesor(String ime) {
        super(ime);
    }

    @Override
    public String toString() {
        return "R. prof."+super.toString();
    }
}
