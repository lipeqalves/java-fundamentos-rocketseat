package pessao;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("1231564897");
        professor.setNome("Filipe");
        professor.setIdade(36);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("1231564897");
        aluno.setNome("Sofia");
        aluno.setIdade(7);
        aluno.setMatricula("1234556");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}
