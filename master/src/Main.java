import entidades.ContaBancaria;
import entidades.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int senha;
        int select = 0;
        int valor = 0;
        int cpf = 0;
        do {
            System.out.println("## Selecione uma opção para prosseguir! ##");
            System.out.println("Opção 1 - Criar Conta");
            System.out.println("Opção 2 - Deposito");
            System.out.println("Opção 3 - Transferencia");
            System.out.println("Opção 4 - Saque");
            System.out.println("Opção 5 - Saldo");
            System.out.println("Opção 6 - Sair");
            System.out.println("_______________________");

            System.out.print("Digite um opção para continuar: ");
            select = Integer.parseInt(sc.nextLine());

            switch (select){
                case 1:
                    System.out.println("_________Nome_________");
                    System.out.print("Digite seu nome: ");
                    pessoa.setNome(sc.nextLine());
                    System.out.println("______________________");
                    if (pessoa.getNome() == null){
                        System.out.println("Nome digitado é nulo!");
                        break;
                    }
                    System.out.println("_________Cpf_________");
                    System.out.print("Digite seu CPF: ");
                    pessoa.setCpf(Integer.parseInt(sc.nextLine()));
                    System.out.println("______________________");
                    if (pessoa.getCpf() <= 0){
                        System.out.println("CPF digitado é nulo");
                    }
                    System.out.println("_________Gênero_________");
                    System.out.print("Digite o Gênero que você se identifica: ");
                    pessoa.setGenero(sc.nextLine());
                    System.out.println("______________________");

                    System.out.println("_________Senha_________");
                    System.out.println("SENHA DEVERÁ CONTER 4 NÚMEROS INTEIROS!");
                    System.out.println("Digite a senha: ");
                    pessoa.setSenha(Integer.parseInt(sc.nextLine()));
                    System.out.println("______________________");
                    if (pessoa.getSenha() <= 1000){
                        System.out.println("Senha digitado é inválida!");
                        break;
                    }else if (pessoa.getSenha() >= 9999){
                        System.out.println("Senha digitado é inválida!");
                        break;
                    }
                    System.out.println("_________Conta Poupança ou Corrente_________");
                    System.out.print("Escolha o tipo de Conta: ");
                    contaBancaria.setConta(sc.nextLine());
                    System.out.println("____________________________________________");

                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println(pessoa.toString());
                    break;
                case 2:
                    if (pessoa.getNome() == null){
                        System.out.println("Você ainda não é um cliente!");
                        break;
                    }
                    System.out.println("Digite sua senha para continuar: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Qual o valor que você deseja depositar? ");
                        contaBancaria.depositar(Double.parseDouble(sc.nextLine()));
                        System.out.println(contaBancaria.getSaldo());
                    } else {
                        System.out.println("Sua senha não é valida!");
                    }
                    break;

                case 3:
                    if (pessoa.getNome() == null){
                        System.out.println("Você ainda não é um cliente!");
                        break;
                    }
                    System.out.println("Digite sua senha para continuar: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Qual o valor que você deseja transferir? ");
                        contaBancaria.transferir(Double.parseDouble(sc.nextLine()));
                        System.out.println("Seu saldo atual é de: " + contaBancaria.getSaldo());
                    } else {
                        System.out.println("Sua senha não é valida!");
                    }
                    break;
                case 4:
                    if (pessoa.getNome() == null){
                        System.out.println("Você ainda não é um cliente!");
                        break;
                    }
                    System.out.println("Digite sua senha para continuar: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Qual o valor que você deseja sacar? ");
                        contaBancaria.sacar(Double.parseDouble(sc.nextLine()));
                        System.out.println("Seu saldo atual é de: " + contaBancaria.getSaldo());
                    } else {
                        System.out.println("Sua senha não é valida!");
                    }
                    break;
                case 5:
                    if (pessoa.getNome() == null){
                        System.out.println("Você ainda não é um cliente!");
                        break;
                    }
                    System.out.println("Digite sua senha para continuar: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("O seu saldo atual é " + contaBancaria.getSaldo());
                        System.out.println("Tipo de conta: " + contaBancaria.getConta());
                    } else {
                        System.out.println("Sua senha não é valida!");
                    }
                    break;
            }

        } while (select != 6);

        sc.close();
    }
}