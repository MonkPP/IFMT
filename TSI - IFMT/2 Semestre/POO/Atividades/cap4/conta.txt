//exercicios 1 e 2 criar atributos e metodos

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    double limite;
    Data dataDeAbertura;
    
    
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
    public void calculaRendimento() {
        double rendimento = this.saldo * 0.1;
        System.out.println("Rendimento mensal de: " + rendimento + " R$");
    }
    
    public void recuperaDadosParaImpressao() {
        System.out.println("\nTitular: " + this.titular);
        System.out.println("Número: " + this.numero);
        System.out.println("Agencia " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        
       /* //exercicio 7
        System.out.println("Dia de abertura: " + this.dataDeAbertura.dia);
        System.out.println("Mes de abertura: " + this.dataDeAbertura.mes);
        System.out.println("Ano de abertura: " + this.dataDeAbertura.ano);*/
        
        //exercicio 9
        //System.out.println(this.dataDeAbertura.formatada);
        System.out.println("Data de abertura: " + this.dataDeAbertura.dia + "/" + this.dataDeAbertura.mes + "/" + this.dataDeAbertura.ano);
        
    }
    
}