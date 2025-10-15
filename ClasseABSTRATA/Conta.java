package ClasseABSTRATA;

public abstract class Conta {
    private int total = 100;

    public int getTotal(){
        return total;
    }

    public void verValor(){
        System.out.println("Valor total:  " + total);
    }

    /*
    //Se eu quiser que a classFilho passe um parametro
    abstract int pegarTaxa(int a);
    */

    abstract int pegarTaxa(); // --> Assinatura do metodo
    abstract void falar();
}
