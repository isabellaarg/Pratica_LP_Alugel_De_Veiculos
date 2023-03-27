package br.com.aluguel;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class InterfaceAluguelDeVeiculos extends JFrame {
    private static final long seriaVersionUID = 1L;
    JButton b1 = new JButton("Salvar");

    public InterfaceAluguelDeVeiculos(){
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        b1.setBounds(269, 414, 124,35);
        add(b1);
    }

    public static void main(String[] args) {
        InterfaceAluguelDeVeiculos aluguel = new InterfaceAluguelDeVeiculos();
        aluguel.telaJFormattedTextField();
    }

    private void telaJFormattedTextField(){
        Container janela = getContentPane();
        setLayout(null);

        JLabel labelDadosCliente = new JLabel("Dados do Cliente: ");
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");

        labelDadosCliente.setBounds(28, 38, 122, 21);
        labelNome.setBounds(28, 70, 57, 21);
        labelCpf.setBounds(28, 102, 57, 21);
        labelTel.setBounds(28, 134, 57, 21);

        JLabel labelDadosCarro = new JLabel("Dados do Carro: ");
        JLabel labelNomeCarro = new JLabel("Nome: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDataLocacao = new JLabel("Data de locação: ");
        JLabel labelDataEntrega= new JLabel("Data de Entrega: ");

        labelDadosCarro.setBounds(28, 186, 122, 21);
        labelNomeCarro.setBounds(28, 218, 57, 21);
        labelPlaca.setBounds(28, 255, 57, 21);
        labelAno.setBounds(28, 290, 57, 21);
        labelDataLocacao.setBounds(28, 330, 97, 27);
        labelDataEntrega.setBounds(28, 357, 97, 27);

        MaskFormatter mascaraDadosCliente = null;
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraDadosCarro = null;
        MaskFormatter mascaraNomeCarro = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDataLocacao = null;
        MaskFormatter mascaraDataEntrega = null;

        try{
            mascaraDadosCliente = new MaskFormatter();

            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraDadosCarro = new MaskFormatter();

            mascaraPlaca = new MaskFormatter("AAA-AAAA");
            mascaraAno = new MaskFormatter("####");
            mascaraDataLocacao = new MaskFormatter("##/##/####");
            mascaraDataEntrega = new MaskFormatter("##/##/####");


            mascaraCpf.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');

            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDataLocacao.setPlaceholderCharacter('_');
            mascaraDataEntrega.setPlaceholderCharacter('_');
        }
        catch (ParseException excep){
            System.err.println("Erro na formatação" + excep.getMessage());
            System.exit(-1);
        }

        JFormattedTextField jFormattedTextFieldDadosCliente = new JFormattedTextField(mascaraDadosCliente);

        JFormattedTextField jFormattedTextFieldNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextFieldCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextFieldTel = new JFormattedTextField(mascaraTel);

        JFormattedTextField jFormattedTextFieldDadosCarro = new JFormattedTextField(mascaraDadosCarro);

        JFormattedTextField jFormattedTextFieldNomeCarro = new JFormattedTextField(mascaraNomeCarro);
        JFormattedTextField jFormattedTextFieldPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextFieldAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextFieldDataLocacao = new JFormattedTextField(mascaraDataLocacao
        );
        JFormattedTextField jFormattedTextFieldDataEntrega = new JFormattedTextField(mascaraDataEntrega);

        //Caixas de input
        jFormattedTextFieldNome.setBounds(132, 70, 273, 21);
        jFormattedTextFieldCpf.setBounds(132, 102, 100, 21);
        jFormattedTextFieldTel.setBounds(132, 134, 94, 21);

        jFormattedTextFieldNomeCarro.setBounds(139, 218, 192, 21);
        jFormattedTextFieldPlaca.setBounds(139, 254, 67, 21);
        jFormattedTextFieldAno.setBounds(139, 290, 45, 21);
        jFormattedTextFieldDataLocacao.setBounds(139, 326, 76, 21);
        jFormattedTextFieldDataEntrega.setBounds(139, 360, 76, 21);

        janela.add(labelDadosCliente);
        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);

        janela.add(labelDadosCarro);
        janela.add(labelNomeCarro);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDataLocacao);
        janela.add(labelDataEntrega);

        janela.add(jFormattedTextFieldDadosCliente);
        janela.add(jFormattedTextFieldNome);
        janela.add(jFormattedTextFieldCpf);
        janela.add(jFormattedTextFieldTel);

        janela.add(jFormattedTextFieldDadosCarro);
        janela.add(jFormattedTextFieldNomeCarro);
        janela.add(jFormattedTextFieldPlaca);
        janela.add(jFormattedTextFieldAno);
        janela.add(jFormattedTextFieldDataLocacao);
        janela.add(jFormattedTextFieldDataEntrega);
        setSize(689, 498);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
