package ro.ase.cts.lab06.Facade;

public class MasinaElectrica implements Automobil{
    private String incarcator;

    public MasinaElectrica(String incarcator) {
        this.incarcator = incarcator;
    }

    @Override
    public void getDescriere(){
        System.out.println("Masina electrica cu incarcator " + this.incarcator);
    }
}
