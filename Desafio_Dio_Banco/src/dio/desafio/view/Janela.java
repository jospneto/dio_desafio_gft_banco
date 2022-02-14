package dio.desafio.view;

import dio.desafio.model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Janela extends JFrame {
    protected JButton butCad;
    protected JLabel labCad, labCadIdade;
    protected JTextField textCadCliente, textCadIdade;

    public Janela(){
        super("Banco Dio");
        setLayout(new FlowLayout());

        labCad = new JLabel("Digite seu nome: ");
        add(labCad);

        textCadCliente = new JTextField(10);
        add(textCadCliente);

        labCadIdade = new JLabel("Digite sua idade: ");
        add(labCadIdade);

        textCadIdade = new JTextField(10);
        add(textCadIdade);

        butCad = new JButton("Cadastrar conta");
        butCad.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nome = textCadCliente.getText();
                        int idade = parseInt(textCadIdade.getText());
                        if(idade >= 18){
                            JanelaTipoConta app = new JanelaTipoConta();
                            app.setVisible(true);
                            setVisible(false);
                        }else{
                            JOptionPane.showMessageDialog(null, "Pessoas com menos de 18 anos só podem criar uma conta junto a um responsavel");
                        }
                    }
                }
        );
        add(butCad);

        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }

    public Cliente pegarCliente(Cliente cliente){
        return cliente;
    }
}
