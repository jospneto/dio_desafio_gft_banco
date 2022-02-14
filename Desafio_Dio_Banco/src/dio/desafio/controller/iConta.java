package dio.desafio.controller;

import dio.desafio.model.Conta;

public interface iConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
}
