package SobreCarga;

public class Main {
    public static void main(String[] args){

        Conta calc = new Conta();

        calc.saldo(5," String p");
        calc.saldo("String n ", 5);
        calc.saldo(4, 5);

        //Metodo com retorn
        System.out.println(calc.saldo(5,7.5));

    }
}
