public class TestaConta {
    public static void main (String[] args) {
    
/*exercicio 1: para	garantirmos	que os atributos da classe Conta não sejam acessados de forma direta em outra classe a qual não seja a própria classe Conta devemos usar o controlador de acesso private */ 
     
/*exercicio 2: Ao deixar os atributos em modo privado na Classe Conta, a classe TestaConta não consegue acessar ou atribuir valores a eles, dando erro na hora de rodar o codigo
  
        o codigo a seguir não roda porque o atributo titular é privado:

        Conta c1 = new Conta();
        c1.titular = "monik";
        System.out.println(c1.titular);*/


        //exercicio 3
        Conta c2 = new Conta();
        c2.setTitular("Monyk");
        System.out.println(c2.getTitular());

        Data dataC2 = new Data();
        dataC2.informaData(24, 10, 2003);

        c2.setDataDeAbertura(dataC2);
        c2.setNumero(2501);
        c2.setAgencia("Banco A");
        c2.deposita(500);
        c2.deposita(-300);
        c2.saca(200);

        c2.recuperaDadosParaImpressao();  

        //teste construtor com titular ex. 4
        Conta c3 = new Conta("Bob");
        Data dtC3 = new Data();
        dtC3.informaData(22, 11, 2000);
        c3.setDataDeAbertura(dtC3);
        c3.recuperaDadosParaImpressao();
        


        Conta c4 = new Conta("Anais", 2563, "Banco C");
        Data dtC4 = new Data();
        dtC4.informaData(12, 12, 2012);
        c4.setDataDeAbertura(dtC4);
        c4.recuperaDadosParaImpressao();

        System.out.println(c4.getTitular());

        //exercicio 5
        //Conta.getIdentificador();

        //System.out.println(c2.getIdObjeto());

        System.out.println(c2.getIdObjeto());

    }    
}