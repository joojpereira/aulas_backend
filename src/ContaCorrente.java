public class ContaCorrente {
    private String titular;
    private int numeroconta;
    private float limite;
    private float saldo;

    public ContaCorrente(String titular, int numeroconta){
        this.titular = titular;
        this.numeroconta = numeroconta;
        this.limite = 1000;
        this.saldo = 0;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void mostrarInfo() {
        System.out.println("titular:" + titular);
        System.out.println("Numero da conta: " + numeroconta);
        System.out.println("Seu saldo é: " + getSaldo());
        System.out.println("Seu limete é: "+ getLimite());
    }



    public int getNumeroconta() {
        return this.numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }



    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }



    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}




