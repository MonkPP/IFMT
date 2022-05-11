class Fibonacci{
    /* //primeiro desafio
    public int	calculaFibonacci(int n) {
        if(n<=2){
            return 1;
        }	
        else{
            return	calculaFibonacci(n-1) + calculaFibonacci(n-2);
        }


        //resposta segunda pergunta
        //este método é mais demorado porque ele sempre tem que calcular os resultados anteriores novamente e depois somalos para achar o resultado atual.*/

        //terceiro desafio
        
        public static int calculaFibonacci(int n){
            return (n<=2 ?  1 : calculaFibonacci(n-1) + calculaFibonacci(n-2));
        }

}