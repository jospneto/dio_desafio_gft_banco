package dio.desafio.model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        super.imprimirInfosComuns();
    }
}
