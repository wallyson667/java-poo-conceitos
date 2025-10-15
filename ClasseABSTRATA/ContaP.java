package ClasseABSTRATA;

//Nas duas subClass tem que ter a mesma assinatura do metodo

public class ContaP extends Conta {

    @Override
    public int pegarTaxa() {
        return this.getTotal() * 3;
    }

    @Override
    public void falar(){
        System.out.println("Meu segundo metodo obrigatorio P");
    }
}
