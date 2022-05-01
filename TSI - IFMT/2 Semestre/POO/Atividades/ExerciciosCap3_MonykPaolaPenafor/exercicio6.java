public class Exercicio6 {
  public static void main (String[] args) {
    int primeiroNum=0, segundoNum=1, n;
    System.out.print (primeiroNum );
    
    for (n=0;n<100;n++) {
      n=primeiroNum+segundoNum;
      segundoNum=primeiroNum;
      primeiroNum=n;
      System.out.print (", ");
      System.out.print (n);
    }
  }
}