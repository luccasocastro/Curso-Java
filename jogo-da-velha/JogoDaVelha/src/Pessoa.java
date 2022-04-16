public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double d, double e){
        this.nome = nome;
        this.idade = idade;
        this.peso = d;
        this.altura = e;
    }

    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }
    
}
