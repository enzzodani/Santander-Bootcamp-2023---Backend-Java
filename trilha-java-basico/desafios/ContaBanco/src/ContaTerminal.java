import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        //Declaração de Variáveis
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Coleta de dados
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor digite seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Por favor, digite seu nome e sobrenome: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();

        //Mensagem final
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
