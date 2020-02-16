package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Fakultet {
    private ArrayList<Osoba> osobe = new ArrayList<>();

    public void dodajOsobu(Osoba o) {
        osobe.add(o);
    }

    @Override
    public String toString() {
        String vracam = "";
        for (Osoba o : osobe) {
            vracam += o.toString();
            vracam += "\n";
        }
        return vracam;
    }

    public Set<Student> studenti() {
        TreeSet<Student> vracam = new TreeSet<>();
        for (Osoba o : osobe) {
            if (o instanceof Student)
                vracam.add((Student) o);
        }
        return vracam;
    }

    public List<Osoba> filtriraj(Function<Osoba, Boolean> f) {
        ArrayList<Osoba> rez = new ArrayList<>();
        for (Osoba o : osobe)
            if (f.apply(o)) rez.add(o);
        return rez;
    }

    public List<BachelorStudent> topBachelor() {
        List lista=filtriraj((Osoba b)->{
            if(b instanceof BachelorStudent && ((BachelorStudent) b).prosjek()>=8)return true;
            return false;
        });
        return lista;
    }

    public List<Mladi> mladi() {
        List<Mladi> rez = new ArrayList<>();
        for (Osoba o : osobe)
            if (o instanceof MasterStudent || o instanceof Docent)
                rez.add((Mladi)o);
        return rez;
    }
}
