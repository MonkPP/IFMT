public class TestaConta {
    public static void main (String[] args) {
        Conta minhaConta = new Conta();
        
        minhaConta.titular = "Monyk Paola Penafor";
        minhaConta.saldo = 2500;
        minhaConta.saca(500);
        minhaConta.deposita(100);
        minhaConta.saca(2200);
        minhaConta.calculaRendimento();
        
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        minhaConta.recuperaDadosParaImpressao();
        
        Conta c1 = new Conta();
        c1.titular = "Maria";
        c1.saldo = 500;
        
        Conta c2 = new Conta();
        c2.titular = "Pedro";
        c2.saldo = 250;
        
        if (c1 == c2) {
            System.out.println("iguais");
        }
        else {
            System.out.println("diferentes");
        }
        
        Conta c3 = new Conta();
        c3.titular = "Amanda";
        c3.saldo = 100;
        Conta c4 = c3;
        
        if (c3 == c4) {
            System.out.println("iguais");
        }
        else {
            System.out.println("diferentes");
        }		

        //** O IF imprimiu "iguais" porque as contas c3 e c4 fazem referencia ao mesmo local, temos só um "new", portanto somente um conta foi criada, esta conta pode ser acessarda pelo c3 e pelo c4.
        
        
        
    }
}