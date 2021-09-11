public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Luccas");
        p2.setNome("Raquel");
        p3.setNome("Liby");
        p4.setNome("Jaime");

        p2.setCurso("Engenharia Civil");
        p3.setSalario(2500.75);
        p4.setSetor("Design");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}