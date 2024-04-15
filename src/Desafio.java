
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Guilherme Rocha Brito";
        String tipoDeConta = "Corrente";
        double saldo = 547.00;
        int opcao = 0;
        double receber;
        double envio;
        ;

        System.out.println(String.format("""
                ***************************************************
                Dados inicias do cliente:
                                
                Nome:            %s
                Tipo de conta:   %s
                Saldo:           %f
                ***************************************************
                """, nome, tipoDeConta, saldo));
        while (opcao != 4) {
            System.out.println("""
                    
                    Operações
                                            
                    1- Cosultar saldos
                    2- Receber valor
                    3- Tranferir valor
                    4- Sair
                                            
                    Digite a opção desejada:
                    
                    """);
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(String.format("\n %.2f \n",saldo ));

                    break;
                case 2:
                    System.out.println("\nDigite o valor a receber:\n ");
                    receber = leitor.nextDouble();
                    saldo += receber;
                    System.out.println(String.format("\n Você recebeu %.2f o seu saldo é de %.2f",receber, saldo));
                    break;
                case 3 :
                    System.out.println("\nDigite o valor a ser enviado:\n");
                    envio = leitor.nextDouble();
                    if(envio < saldo){
                        saldo -= envio;
                        System.out.println(String.format("\n Você trasferiu %.2f o seu saldo é de %.2f",envio, saldo));
                    }else {
                        System.out.println("\n Você não possui saldo suficiente para transação");
                    }
                    break;
                case 4 :
                    System.out.println("Até logo.");


            }
        }
    }
}
