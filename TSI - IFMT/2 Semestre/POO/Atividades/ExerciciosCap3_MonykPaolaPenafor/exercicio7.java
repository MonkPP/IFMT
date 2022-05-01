public class Exercicio7 {
  public static void main (String[] args) {
    int x=17;
    while (x!=1) {
      if (x%2==0) {
        x=x/2;
      }
      else {
        x=x*3+1;
      } 
      System.out.print(x);
      if (x!=1){
        System.out.print("–> ");
      }
    }
  }
}