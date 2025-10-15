package Get_Set;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Einstein");
        pessoa1.setIdade(25);
        System.out.println(pessoa1.exibirDados());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Clarice");
        pessoa2.setIdade(30);
        System.out.println(pessoa2.exibirDados());
    }
}
