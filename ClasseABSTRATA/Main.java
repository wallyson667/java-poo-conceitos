package ClasseABSTRATA;

/*
Não posso criar um objeto da classe pai
*/

public class Main {
    public static void main(String[] args){

        Conta c;

        c = new ContaC();
        c.verValor();
        System.out.println("Taxa da conta corrente: " + c.pegarTaxa());
        c.falar();

        System.out.println();

        c = new ContaP();
        c.verValor();
        System.out.println("Taxa da conta poupança: " + c.pegarTaxa());
        c.falar();
    }
}
