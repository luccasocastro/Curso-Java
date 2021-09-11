public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa...");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Bolsista tem benefício! Mensalidade facilitada!");
    }
}