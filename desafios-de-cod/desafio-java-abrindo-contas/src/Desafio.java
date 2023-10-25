import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    System.out.println("Conta: " + numeroConta);
    System.out.println("Titular: " + nomeTitular);
    System.out.println("Saldo: R$ " + saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}