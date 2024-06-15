import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);


        //Exibir as mensagens para o nosso usuário
        
        System.out.println("Por favor, digite o seu nome ");
        //Obter pela scanner os valores digitados no terminal
        String NomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Agência! ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta! ");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo ");
        double Saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
