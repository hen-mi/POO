
class Teste {

    public void executar() {

    Conta conta = new Conta(1111);
        System.out.println("Numero = " + conta.getNumero());
        System.out.println("Saldo = " + conta.getSaldo());
        System.out.println("Tipo = " + conta.getTipo());
        System.out.println("Ativa = " + conta.EstaAtiva());
    }
}