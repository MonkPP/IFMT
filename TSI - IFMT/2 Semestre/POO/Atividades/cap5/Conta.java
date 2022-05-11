public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private double limite;
    private Data dataDeAbertura;
    
    
    //exercicio 2 getters e setters
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    } 
    public String getAgencia(){
        return this.agencia;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }


    
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }








    public boolean saca(double quantidade) {
        if(this.saldo < quantidade){
			System.out.println("Saldo insuficiente, saque não realiazdo.");
			return false;
		}
		else{
			this.saldo = this.saldo - quantidade;
			System.out.println("Saque de " + quantidade + " R$ realizado.");
			return true;
		}
	}


    public void deposita(double quantidade) {
        this.saldo += quantidade;
        System.out.println("Deposito de " + quantidade + " R$ realizado.");
    }
    public void getRendimento() {
        double rendimento = this.saldo * 0.1;
        System.out.println("Rendimento mensal de: " + rendimento + " R$");
    }
    
  
    public void recuperaDadosParaImpressao() {
        System.out.println("\nTitular: " + this.getTitular());
        System.out.println("Número: " + this.numero);
        System.out.println("Agencia " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println( "Data de Abertura: " + this.dataDeAbertura.formatada());
      
    }
    
}