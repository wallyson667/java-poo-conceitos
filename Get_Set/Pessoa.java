package Get_Set;

/*
GET E SET
*/

public class Pessoa {

    private String nome;
    private int idade;

    // Getter para obter o nome
    public String getNome() {
        return nome;
    }

    // Setter o nome e validação
    public void setNome(String nome) {
        // Nome não é nulo
        if (nome != null) {
            // Remover espaços em branco e verificar se não está vazio
            String nomeLimpo = nome.trim();

            //Verificar se nome não é igual a zero
            if (!nomeLimpo.isEmpty()) {
                this.nome = nomeLimpo;
            } else {
                System.err.println("Erro: O nome não pode ser vazio.");
            }

        } else {
            System.err.println("Erro: O nome não pode ser nulo.");
        }
    }

    //Setter para idade e idade apropriada
    public void setIdade(int idade){
        if(idade > 0 && idade < 120){
            this.idade = idade;
        }else{
            System.out.println("Idade invalida");
        }
    }

    // Getter para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para exibir os dados da pessoa
    public String exibirDados() {
        return "Nome: " + nome + "\nIdade: " + idade;
    }
}
