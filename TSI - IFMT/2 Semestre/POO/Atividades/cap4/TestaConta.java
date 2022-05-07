public class TestaConta {
    public static void main (String[] args) {
        //testando os metodos iniciais
        Conta minhaConta = new Conta();
        minhaConta.titular = "Monyk Paola Penafor";
        minhaConta.saldo = 2500;
        minhaConta.saca(500);
        minhaConta.deposita(100);
        minhaConta.saca(2200);
        minhaConta.calculaRendimento();
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        
        
        
        
        
        //exercicio 4 
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
        
        //exercicio 5
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
        
        //exercicio 6
        
        Conta c10 = new Conta();
        Data data10 = new Data();
        c10.dataDeAbertura = data10;
        data10.informaData(12, 11, 2013);
        
        c10.recuperaDadosParaImpressao();
        
        /* continuação exercicio 7:	se chamarmos o método recuperaDadosParaImpressao 
        antes de atribuirmos uma data a essa Conta dia, mes e ano não receberam nenhum valor, então é impresso
        o valor default, equivalente a zero (ele imprime zero)*/
        
        /*exercicio 8: se você tentar acessar um atributo diretamente na classe o valor desse atributo será 
        valido para todos os objetos que você criar a partir dessa classe, o como objetos tem valores diferentes não
        faz sentido fazer isso, ja que a classe é só o esqueleto/esquema/forma do objeto*/
        
        // teste exercicio 9
        Conta c20 = new Conta();
        Data data20 = new Data();
        c20.dataDeAbertura = data20;
        data20.informaData(12, 11, 2013);
        
        c10.recuperaDadosParaImpressao();
        
        
        
    }
}