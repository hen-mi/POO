class Teste {
  
    public void executar() {
      Cliente cliente = new Cliente();
      cliente.nome = "Carlos";
      int i = 1;
      Conta c1 = new Conta(1111);
      Conta p1 = new Conta(2111);
      
        //cliente.contas.add(c1);
        //cliente.contas.add(p1);
  
        cliente.novaConta(c1);
        cliente.novaConta(p1);
        c1.creditar(1000);
        p1.debitar(3500);
        System.out.println("Contas do cliente " + cliente.nome);
  
      for(Conta aux : cliente.carteira) {
        System.out.println("Conta " + (i++) + ": "   +
                           aux.getNumero() + ") " +
                           "\nR$: " +
                           aux.getSaldo());
  
        System.out.print("\n");
      }
  
    }
  
  
    
  }