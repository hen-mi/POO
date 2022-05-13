import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    ArrayList<Integer> ConsumoAgua = new ArrayList<Integer>();
    int qtdMoradores = teclado.nextInt();
    int i = 0;
    int total = 0;
    int acima = 0;
    int ConsumoMorador;
    while(i != qtdMoradores) {
      ConsumoMorador = teclado.nextInt();
      ConsumoAgua.add(ConsumoMorador);
      total += ConsumoMorador;
      i++;
    }

    System.out.println("MEDIA = " + total/qtdMoradores);
    for(Integer aux : ConsumoAgua) {
      if(aux >= total/qtdMoradores){
        acima++;
      }

    }
    System.out.println("ACIMA = " + acima);  
    teclado.close();
  }
  
}
