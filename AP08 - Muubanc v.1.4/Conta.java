class Conta {

    private int numero;
    private float saldo;
    private boolean ativa;
    private int tipo;
 
 
    public Conta(int numero) {
 
         this.saldo = 0;
         this.tipo = 1;
         this.numero = numero;
         this.ativa = true;
     }
     public float getSaldo(){
     return this.saldo;
     }
      public int getNumero(){
     return this.numero;
     }
     public int getTipo(){
     return this.tipo;
     }
     public boolean EstaAtiva(){
     return this.ativa;
     }
 
     public void creditar(float valor) {
       this.saldo += valor;

     }
  
     public void debitar(float valor) {
         if(valor > this.saldo) {
             this.saldo -= valor + 10;

         } else {
            this.saldo -= valor;
         }
     }  
 
   
 }