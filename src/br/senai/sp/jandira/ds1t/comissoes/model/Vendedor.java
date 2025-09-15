package br.senai.sp.jandira.ds1t.comissoes.model;

import java.util.Scanner;

public class Vendedor {

    String nomeVendedor;
    double totalVendas;
    double percentualComissao;
    double valorComissao;

    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        // Obtendo os dados dos vendedores
        System.out.println("** CALCULADORA DE COMISSÕES **");
        System.out.println("-------------------------------------");

        // Obtendo o nome do vendedor
        System.out.println("Nome do(a) vendedor(a): ");
        nomeVendedor = leitor.nextLine();

        // Obtendo o total de vendas do vendedor
        System.out.println("Total de vendas do(a) " + nomeVendedor + ":");
        totalVendas = leitor.nextDouble();

        calcularComissao();

    }
    public void calcularComissao(){
        if (totalVendas < 20000){
            percentualComissao = 5;
        }else {
            percentualComissao = 10;
        }
        valorComissao = totalVendas * percentualComissao / 100;
        System.out.println(valorComissao);

        exibirResultados();

    }
    public void exibirResultados(){
        String resultadoEmDecimal = String.format("%.2f", valorComissao);
        System.out.println("-----------------------------");
        System.out.println("Nome do(a) vendedor(a): " + nomeVendedor);
        System.out.println("Total de vendas: R$" + totalVendas);
        System.out.println("Percentual de comissão: " + percentualComissao + "%");
        System.out.println("Valor da comissão: R$" + resultadoEmDecimal);
        System.out.println("-----------------------------");
    }


}
