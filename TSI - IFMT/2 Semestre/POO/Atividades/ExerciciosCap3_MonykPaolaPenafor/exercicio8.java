public class Exercicio8 {
  public static void main (String[] args) {
    int x,n,num;
    
    for(x=1;x<=10;x++) {
      for(n=1;n<=x;n++){
        num=n*x;
        System.out.print(num + " ");
      }
      System.out.println(" ");
    }
  }
}