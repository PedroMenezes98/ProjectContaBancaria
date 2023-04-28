import java.util.Scanner;
class main {
    private static int Scanner;

    public static void main(String[] args) {

        double saldoInicial = 5000;
        double valorDepositado;
        double valorTransferencia;
        int operacao;
        int situacao = 1;
        String nomeUsuario = "Pedro Lucas de Aragão Menezes";
        String tipoConta = "Corrente";
        Scanner leitura = new Scanner(System.in);

        System.out.println("Dados do cliente \n" + "********************** \n" + "Nome do cliente : " + nomeUsuario + "\n" + "Tipo de conta : " + tipoConta + "\n" + "Saldo incial : " + saldoInicial + "\n" + "********************** \n" );
        System.out.println("Selecione uma das operações \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
        operacao = leitura.nextInt();

        while (situacao == 1) {
            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo atual é de = R$" + saldoInicial + "\n" + "Deseja selecionar outra operação \n" + "Caso sim digite [1] caso não [0] " );
                    situacao = leitura.nextInt();
                    if (situacao == 0) {
                        System.out.println("Até a próxima");}
                    else if (situacao == 1) {
                        System.out.println("Selecione uma operação \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                        operacao = leitura.nextInt();}
                    else {
                        System.out.println("Selecione opção válida");
                        situacao = leitura.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Qual valor deseja depositar ?");
                    saldoInicial = saldoInicial + leitura.nextDouble();
                    System.out.println("Seu novo saldo é de = R$" + saldoInicial + "\n" + "Deseja selecionar outra operação \n" + "Caso sim digite [1] caso não [0] ");
                    situacao = leitura.nextInt();
                    if (situacao == 0) {
                        System.out.println("Até a próxima");}
                    else if (situacao == 1) {
                        System.out.println("Selecione uma operação \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                        operacao = leitura.nextInt();}
                    else {
                        System.out.println("Selecione opção válida");
                        situacao = leitura.nextInt();}
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir ?");
                    valorTransferencia = leitura.nextDouble();
                    if (saldoInicial >= valorTransferencia) {
                        System.out.println(saldoInicial = saldoInicial - valorTransferencia);
                        System.out.println("Seu novo saldo é = R$" + saldoInicial);
                        System.out.println("Deseja selecionar outra operação caso sim digite [1] caso não [0] ");
                        situacao = leitura.nextInt();
                        if (situacao == 0) {
                            System.out.println("Até a próxima");}
                        else if (situacao == 1) {
                            System.out.println("Selecione uma operação \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                            operacao = leitura.nextInt();}
                        else {
                            System.out.println("Selecione opção válida");
                            situacao = leitura.nextInt();}
                        break;
                    } else if (saldoInicial < valorTransferencia); {
                    System.out.println("Saldo insuficiente, seu saldo atual é de = R$" + saldoInicial + " Deseja selecionar outra operação ? \n" + "Caso sim digite [1] caso não [0] ");
                    situacao = leitura.nextInt();}
                if (situacao == 0) {
                    System.out.println("Até a próxima");}
                else {
                    System.out.println("Selecione uma operação\n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                    operacao = leitura.nextInt();}
                break;
                case 4:
                    System.out.println("Deseja mesmo encerrar sessão \n" + "Caso sim digite [0] caso não [1] ");
                    situacao = leitura.nextInt();
                    if (situacao == 0) {
                        System.out.println("Até a próxima"); }
                    else if (situacao == 1) {
                        System.out.println("Selecione uma operação \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                        operacao = leitura.nextInt();}
                    else {
                        System.out.println("Selecione opção válida");
                        situacao = leitura.nextInt();}
                    break;
                default:
                    System.out.println("Selecione opção válida \n" + "1 - Consulta de saldo \n" + "2 - Deposito \n" + "3 - Transferir valor \n" + "4 - Sair");
                    operacao = leitura.nextInt();
            }
        }
    }
}


