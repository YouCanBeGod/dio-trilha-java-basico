package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Todo: -Conhcer e impotar a classe scanner
        //Todo: -Exibir mensagens
        //Todo: -Obter valores digitados no terminal
        //Todo: -Exibir a mensagem final

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int conta = entrada.nextInt();
        System.out.println("Digite o número da agencia: ");
        String agencia = entrada.next();
        System.out.println("Digite seu Nome:  ");
        String cliente = entrada.next();
        System.out.println("Digite o valor de Saldo: ");
        double saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %s e seu saldo %.2f já está disponível para saque", cliente, agencia, conta, saldo );

    }
}