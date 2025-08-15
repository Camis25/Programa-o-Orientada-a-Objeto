public class ContaBancaria {
    private String titular;
    private double saldo;
    private boolean contaAberta = false;

    public ContaBancaria(String titular) {
        this.titular = titular;
        System.out.println(titular + " cadastrado com sucesso");
    }

    public void setDepositar(double deposito){
        this.saldo = saldo + deposito;

    }

    public void setSacar(double saque){
        this.saldo = saldo - saque;

    }

    public void abrir(){
        if(this.contaAberta){
            System.out.println("A conta já está aberta");
        }else{
            this.contaAberta = true;
            System.out.println("Conta aberta com sucesso");
        }
    }

    public void fechar(){
        if(this.contaAberta){
            this.contaAberta = false;
            System.out.println("Conta fechada!");
        }else{
            System.out.println("A conta já está fechada");
        }
    }

    public double getMostrarSaldo(){
        return this.saldo;
    }
}
