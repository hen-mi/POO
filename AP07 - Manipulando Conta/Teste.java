import java.util.Scanner;

class Teste {

  public void executar() {
    Scanner teclado = new Scanner(System.in);
    Conta conta = new Conta(1111);
      System.out.println("Numero = " + conta.getNumero());
      System.out.println("Saldo = " + conta.getSaldo());
      System.out.println("Tipo = " + conta.getTipo());
      System.out.println("Ativa = " + conta.EstaAtiva());
      System.out.println("Digite a quantia que quer creditar:");

      float qtdCreditar = teclado.nextFloat();
      conta.creditar(qtdCreditar);
      System.out.println("Novo Saldo = " + conta.getSaldo());
      System.out.println("Digite a quantia que quer debitar:");
      float qtdDebitar = teclado.nextFloat();
      conta.debitar(qtdDebitar);
      System.out.println("Novo Saldo = " + conta.getSaldo());
      teclado.close();
  }


  
}