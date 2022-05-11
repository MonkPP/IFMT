public class TestaFibonacci {
    public static void main (String[] args) {
            
        Fibonacci a = new Fibonacci();
            for (int i = 1; i <= 7; i++){
                int resultado = a.calculaFibonacci(i);
                System.out.println(resultado);
            }
    }
}
