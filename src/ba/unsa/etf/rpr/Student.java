package ba.unsa.etf.rpr;

public class Student extends Osoba implements Comparable<Student> {
    private String brojIndeksa="";
    private int[] ocjene=new int[100];
    private int velicina=0;
    public Student(String imePrezime) {
        super(imePrezime);
    }

    @Override
    public String toString() {
        String rez = "student "+getImePrezime()+" ("+getBrojIndeksa()+"), prosjek ocjena: ";
        double zaokruzen = Math.round(prosjek() * 10);
        zaokruzen /= 10;
        rez += zaokruzen;
        return rez;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int[] getOcjene() {
        return ocjene;
    }

    public void setOcjene(int[] ocjene) {
        this.ocjene = ocjene;
    }

    public int getVelicina() {
        return velicina;
    }

    public void setVelicina(int velicina) {
        this.velicina = velicina;
    }

    public void dodajOcjenu(int ocjena) throws IlegalnaOcjena {
        if(velicina>=100)throw new IllegalArgumentException("Dosegnut maksimalan broj ocjena");
        if(ocjena<5 || ocjena>10)throw new IlegalnaOcjena("Ilegalna ocjena "+ocjena);
        ocjene[velicina]=ocjena;
        velicina++;
    }

    public double prosjek() {
        if(velicina==0)return 0;
        double sum=0;
        for(int i=0;i<velicina;i++){
            sum+=ocjene[i];
        }
        double prosjek=sum/velicina;
        return prosjek;
    }


    @Override
    public int compareTo(Student student) {
        if(prosjek()>student.prosjek())return -1;
        return 1;
    }
}
