package ClasseABSTRATA;

//Nas duas subClass tem que ter a mesma assinatura do metodo

public class ContaC extends Conta{

    @Override
    public int pegarTaxa() {
        return this.getTotal() * 2;
    }

    @Override
    public void falar(){
        System.out.println("Meu segundo metodo obrigatorio C");
    }
}
