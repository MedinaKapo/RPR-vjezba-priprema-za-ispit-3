package ba.unsa.etf.rpr;

public class MasterStudent extends Student implements Mladi{
    private int[] ocjeneMaster=new int[100];
    private int brojOcjenaMaster=0;
    public MasterStudent(String ime) {
        super(ime);
    }

    @Override
    public String toString() {
        return "Master "+super.toString();
    }

    public void dodajOcjenuMaster(int ocjena) throws IlegalnaOcjena {
        if(brojOcjenaMaster>=100)throw new IllegalArgumentException("Dosegnut maksimalan broj ocjena");
        if(ocjena<5 || ocjena>10)throw new IlegalnaOcjena("Ilegalna ocjena "+ocjena);
        ocjeneMaster[brojOcjenaMaster]=ocjena;
        brojOcjenaMaster++;
    }

    public double prosjekMaster() {
        if(brojOcjenaMaster==0)return 0;
        double sum=0;
        for(int i=0;i<brojOcjenaMaster;i++){
            sum+=ocjeneMaster[i];
        }
        double prosjek=sum/brojOcjenaMaster;
        return prosjek;
    }
    public double prosjek(){
        if(getVelicina()==0 && brojOcjenaMaster==0)return 0;
       double sum=0;
        for(int i=0;i<brojOcjenaMaster;i++){
            sum+=ocjeneMaster[i];
        }
        for(int i=0;i<getVelicina();i++){
            sum+=getOcjene()[i];
        }
        double prosjek=sum/(getVelicina()+brojOcjenaMaster);
        return prosjek;
    }
}
