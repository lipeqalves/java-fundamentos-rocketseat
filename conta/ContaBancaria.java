package conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    // Getters e Setters metodos criados para manepular as informações dessa classe

    public ContaBancaria(){
        saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }

    public double getSaldo() {
        return saldo;
    }

    // metodo depositar
    void depositar(double valor) {
        if (valor > 0) {
            System.out.println("saldo atual R$ " + saldo);
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + ". Saldo atualizado R$ " + saldo);
        } else {
            System.out.println("O valor de depósito é invalido");
        }
    }
    // metodo sacar

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println(" Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
        }
    }

}
