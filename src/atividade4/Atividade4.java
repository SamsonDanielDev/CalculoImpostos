package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Instanciado o objeto:
        Pagamentos pagamentos = new Pagamentos();

        // 2. Definindo o nome da empresa:
        System.out.print("Informe o nome da empresa: ");
        String nomeEmpresa = in.nextLine();
        pagamentos.setNomeEmpresa(nomeEmpresa);

        // 3. Criando a lista de impostos:
        ArrayList<Impostos> listaImpostos = new ArrayList<>();

        String resposta = "";
        while (!resposta.equalsIgnoreCase("pare")) {
            System.out.print("Informe o tipo de imposto (PIS ou IPI) ou 'pare' para interromper o programa: ");
            resposta = in.nextLine();

            if (resposta.equalsIgnoreCase("PIS")) {
                System.out.print("Informe o valor total de débito: ");
                float debito = in.nextFloat();
                in.nextLine();
                System.out.print("Informe o valor total de crédito da corporação: ");
                float credito = in.nextFloat();
                in.nextLine();
                PIS novoImpostoPIS = new PIS(debito, credito);
                listaImpostos.add(novoImpostoPIS);
            }
            if (resposta.equalsIgnoreCase("IPI")) {
                System.out.print("Informe o valor da alíquota: ");
                float aliquota = in.nextFloat();
                in.nextLine();
                System.out.print("Informe o valor do produto: ");
                float valorProduto = in.nextFloat();
                in.nextLine();
                System.out.print("Informe o valor do frete: ");
                float frete = in.nextFloat();
                in.nextLine();
                System.out.print("Informe o valor do seguro: ");
                float valorSeguro = in.nextFloat();
                in.nextLine();
                System.out.print("Informe o total das despesas: ");
                float despesas = in.nextFloat();
                in.nextLine();

                IPI novoImpostoIPI = new IPI(aliquota, valorProduto, frete, valorSeguro, despesas);

                listaImpostos.add(novoImpostoIPI);
            }

        }

        for (Impostos I : listaImpostos) {
            System.out.println("-----------------");
            I.descricaoImposto();
        }

    }

}
