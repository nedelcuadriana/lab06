package ro.ase.cts.lab06.Facade;

public class MasinaFamilie implements Automobil{
    private boolean scaunCopil;

    public MasinaFamilie(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    @Override
    public void getDescriere() {
        if(scaunCopil){
            System.out.println("Masina de familie are scaun pentru copil");
        } else {
            System.out.println("Masina de familie nu are scaun pentru copil");
        }
    }
}
