package dio.desafio.model;

import javax.swing.*;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        super.imprimirInfosComuns();
    }
}
