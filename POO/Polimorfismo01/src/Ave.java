public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Recolhendo galhinhos...");
    }

    @Override
    public void alimentar() {
        System.out.println("Sementes e frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Kyyaaaaaah... pru pru...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }


}
