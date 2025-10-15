package SobreCarga;

/*
Metodos com o mesmo nome mas com assinaturas diferentes
*/

public class Conta {

    protected int total = 100;

    //função 1
    public void saldo(){
        System.out.print("Função 1: ");
        System.out.print(this.total);
    }

    //função 2
    public void saldo(Integer x){
        System.out.print("Função 2: ");
        System.out.println(x);
    }

    //função 3
    public void saldo(Integer x, String y){
        System.out.print("Função 3: ");
        System.out.println(x + y);
    }

    //função 4
    // Ele não dá erro porque a ordem tambem importa
    public void saldo(String x, Integer y){
        System.out.print("Função 4: ");
        System.out.println(x + y);
    }

    //função 5
    public void saldo(Integer x, Integer y){
        System.out.print("Função 5: ");
        System.out.println(x + y);
    }

    //função 6
    //metodo para retorno:
    public Double saldo(Integer x, Double y){
        System.out.print("Função 6: ");
        return x + y;
    }
}
