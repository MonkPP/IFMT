public class Exercicio5 {
  public static void main (String [] args) {
    long fatorial = 1, n;
    for (n=1;n<=30;n++) {
      fatorial = fatorial*n;
      System.out.println( "Fatorial de " + n + " é " + fatorial);
    }
    System.out.println("Começa a dar errado porque o valor aumenta e o resultado acaba não cabendo em uma variavel do tipo inteiro por não ter bits suficientes,  já a variavel do tipo long consegue armazenar mais bits, por isso consegue calcular resultados mais grandes, ainda assim é necessária uma variavel capaz de armazenar mais bits para resultados ainda maiores.");
  }
}