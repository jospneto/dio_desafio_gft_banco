package dio.desafio.view;

import dio.desafio.model.Cliente;
import dio.desafio.model.Conta;
import dio.desafio.model.ContaCorrente;
import dio.desafio.model.ContaPoupanca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.*;

public class JanelaTipoConta extends JFrame {
    Janela app;
    private JCheckBox checkCorrente, checkBoxPoupança;
    private JButton butEscolha;

    public JanelaTipoConta(){
        setLayout(new FlowLayout());

        checkCorrente = new JCheckBox("Conta corrente");
        add(checkCorrente);

        checkBoxPoupança = new JCheckBox("Conta poupança");
        add(checkBoxPoupança);

        butEscolha = new JButton("Fazer escolha");
        butEscolha.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(checkCorrente.isSelected() == true && checkBoxPoupança.isSelected() == false){
                            String nome = app.textCadCliente.getText();
                            int idade = parseInt(app.textCadIdade.getText());
                            Cliente cliente = new Cliente();
                            cliente.setNome(nome);
                            cliente.setIdade(idade);

                            Conta corrente = new ContaCorrente(cliente);
                            JOptionPane.showMessageDialog(null, "Parabéns " + cliente.getNome() +
                                    "sua conta corrente foi criada! \n" + "Seus dados");
                        }else{
                            String nome = app.textCadCliente.getText();
                            int idade = Integer.parseInt(app.textCadIdade.getText());
                            Cliente cliente = new Cliente();
                            cliente.setNome(nome);
                            cliente.setIdade(idade);

                            Conta poupanca = new ContaPoupanca(app.pegarCliente(cliente));
                            JOptionPane.showMessageDialog(null, "Parabéns " + cliente.getNome() +
                                    "sua conta pouança foi criada! \n" + "Seus dados");
                        }
                    }
                }
        );
        add(butEscolha);

        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}
