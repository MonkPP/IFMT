public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    double limite;
    String dt_abertura;
    
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
        System.out.println("\n" + titular);
        System.out.println(numero);
        System.out.println(agencia);
        System.out.println(saldo);
        System.out.println(limite);
        System.out.println(dt_abertura + "\n");
    }
    
}