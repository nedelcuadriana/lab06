package ro.ase.cts.lab06.Facade;

public class DealerAuto {
    MasinaFamilie mf = null;
    MasinaSport ms = null;
    MasinaElectrica me = null;

    public DealerAuto() {
    }

    public void getDescriereMF() {
        if(mf == null) {
            mf = new MasinaFamilie(true);
        }
        mf.getDescriere();
    }

    public void getDescriereMS() {
        if(ms == null){
            ms = new MasinaSport("AL500");
        }
        ms.getDescriere();
    }

    public void getDescriereME() {
        if(me == null) {
            me = new MasinaElectrica("300");
        }
        me.getDescriere();
    }
}
