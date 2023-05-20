public class ContaPoupanca extends Conta implements Investimento{
    
    public ContaPoupanca(int numero, Cliente titular){
        super(numero, titular);
    }
    
    public void rejustar(double percentual){
        saldo = saldo + saldo * percentual;
    }

    @Override
    public boolean sacar(double valor){
        if(this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void reajustar (double reajuste) {

    }
}