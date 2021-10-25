public class PessoaFisica extends Pessoa{
    private int cpf;
    private boolean vales;

    public PessoaFisica(String nome, String sexo, String nacionalidade, int cpf, boolean vales) {
        super(nome, sexo, nacionalidade);
        this.cpf = cpf;
        this.vales = vales;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isVales() {
        return vales;
    }

    public void setVales(boolean vales) {
        this.vales = vales;
    }
}
