package dio.desafio.model;

import javax.swing.*;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarContas(){
        JOptionPane.showMessageDialog(null, "Contas: " + contas.toString());
    }
}
