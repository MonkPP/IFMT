public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private static int idConta;
    private int idObejto;
    
    public static int calculaIdConta(){
        return Conta.idConta = Conta.idConta + 1;
    }
    Conta(){
        Conta.calculaIdConta();
        this.idObejto = Conta.idConta;
    }
    public int getIdObjeto(){
        return this.idObejto;
    }


    //exercicio 4 - metodo construtor com titular opcional
    Conta(String titular){
        this.titular = titular;
        Conta.calculaIdConta();
        this.idObejto = Conta.idConta;
    }
    //Conta(){}
    Conta(String titular, int numero, String agencia){
        this.titular=titular;
        this.numero=numero;
        this.agencia=agencia;
        Conta.calculaIdConta();
        this.idObejto = Conta.idConta;
    }

    
    
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
    public Data getDataDeAbertura(){
        return this.dataDeAbertura;
    }
    public void setDataDeAbertura(Data dataDeAbertura){
        this.dataDeAbertura = dataDeAbertura;
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
        if (quantidade > 0){
            this.saldo += quantidade;
            System.out.println("Deposito de " + quantidade + " R$ realizado.");
        }
        else{
            System.out.println("Deposito invalido");
        }       
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
        System.out.println( "Data de Abertura: " + this.dataDeAbertura.formatada() + "\n");
      
    }
    
}